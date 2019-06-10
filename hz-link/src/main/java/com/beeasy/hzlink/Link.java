package com.beeasy.hzlink;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import com.beeasy.hzlink.model.*;
import com.github.llyb120.nami.core.Arr;
import com.github.llyb120.nami.core.Obj;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import static com.github.llyb120.nami.core.DBService.sqlManager;
import static com.github.llyb120.nami.core.Json.*;

public class Link {

    public static void do11_1(String compName) {
        var ret = a();
        //企业基本信息
        var detail = sqlManager.lambdaQuery(QccDetails.class)
            .andEq(QccDetails::getInner_company_name, compName)
            .single();
        if (detail == null) {
            return;
        }

        //主要人员
        var ps = sqlManager.lambdaQuery(QccDetailsEmployees.class)
            .andEq(QccDetailsEmployees::getInner_company_name, compName)
            .andLike(QccDetailsEmployees::getJob, "%董事%")
            .select(QccDetailsEmployees::getName);

        //股东
        var dps = sqlManager.lambdaQuery(QccDetailsPartners.class)
            .andEq(QccDetailsPartners::getInner_company_name, compName)
            .andEq(QccDetailsPartners::getStock_type, "自然人股东")
            .select();

        var arr = new LinkedHashSet<>();
        //加入法人
        arr.add(detail.getOper_name());
        //加入董事
        for (QccDetailsEmployees p : ps) {
            arr.add(p.getName());
        }
        //加入持股25%以上的自然人股东
        for (QccDetailsPartners dp : dps) {
            //算不出来的一概忽略
            try {
                var p = Float.parseFloat(dp.getStock_percent().replaceAll("%", ""));
                if (p >= 25) {
                    arr.add(dp.getStock_name());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //移除空的项目
        arr.removeIf(p -> StrUtil.isEmptyIfStr(p));

        if (arr.size() == 0) {
            return;
        }

        //检查董监高
        //担任法人
        var dfaren = sqlManager.lambdaQuery(QccCiaCompanyLegals.class)
            .andEq(QccCiaCompanyLegals::getInner_company_name, compName)
            .andIn(QccCiaCompanyLegals::getPer_name, arr)
            .select(QccCiaCompanyLegals::getName, QccCiaCompanyLegals::getPer_name);
        for (QccCiaCompanyLegals qccCiaCompanyLegals : dfaren) {
            ret.add(a(qccCiaCompanyLegals.getName(), qccCiaCompanyLegals.getPer_name(), "法人"));
        }
        //担任董事
        var dongshi = sqlManager.lambdaQuery(QccCiaForeignOffices.class)
            .andEq(QccCiaForeignOffices::getInner_company_name, compName)
            .andIn(QccCiaForeignOffices::getPer_name, arr)
            .andLike(QccCiaForeignOffices::getPosition, "%董事%")
            .select(QccCiaForeignOffices::getName, QccCiaForeignOffices::getPer_name);
        for (QccCiaForeignOffices qccCiaForeignOffices : dongshi) {
            ret.add(a(qccCiaForeignOffices.getName(), qccCiaForeignOffices.getPer_name(), "董事"));
        }
        //25%以上的自然人股东
        var gudong = sqlManager.lambdaQuery(QccCiaForeignInvestments.class)
            .andEq(QccCiaForeignInvestments::getInner_company_name, compName)
            .andIn(QccCiaForeignInvestments::getPer_name, arr)
            .select();
        for (QccCiaForeignInvestments qccCiaForeignInvestments : gudong) {
            //有的没数据，忽略
            if (StrUtil.isNotBlank(qccCiaForeignInvestments.getReg_cap()) && StrUtil.isNotBlank(qccCiaForeignInvestments.getSub_con_amt())) {
                //算不出来的一概忽略
                try {
                    var val = qccCiaForeignInvestments.getSub_con_amt();
                    if (val.contains(",")) {
                        var items = StrUtil.splitTrim(val, ",");
                        var i = new BigDecimal(0);
                        for (String item : items) {
                            i.add(new BigDecimal(item));
                        }
                        val = i.toString();
                    }
                    var percent = convertToMoney(val + "万").divide(convertToMoney(qccCiaForeignInvestments.getReg_cap()), 2);
                    if (percent.floatValue() >= 0.25) {
                        ret.add(a(qccCiaForeignInvestments.getName(), qccCiaForeignInvestments.getPer_name(), "自然人"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        //检查是否在我行有贷款
        if (ret.size() == 0) {
            return;
        }
        var allCompName = ret.toArrList().stream()
            .map(o -> o.getString(0))
            .distinct()
            .collect(Collectors.toList());
        var allows = hasLoan(allCompName);
        ret.removeIf(a -> {
            return allows.stream()
                .allMatch(
                    e -> !((Arr) a).getString(0).equals(e)
                );
        });

        //整理数据
        sqlManager.lambdaQuery(Link111.class)
            .andEq(Link111::getOrigin_name, compName)
            .andEq(Link111::getLink_rule, "11.1")
            .delete();
        var cache = o();
        var batch = a();
        for (Arr objects : ret.toArrList()) {
            var key = objects.getString(0) + objects.getString(1);
            if (cache.containsKey(key)) {
                continue;
            }
            Link111 link111 = new Link111();
            link111.setOrigin_name(compName);
            link111.setId(IdUtil.objectId());
            link111.setLink_left(objects.getString(0));
            link111.setLink_right(objects.getString(1));
            link111.setLink_type(objects.getString(2));
            link111.setLink_rule("11.1");
            link111.setIs_company(1);
            cache.put(key, true);
            batch.add(link111);
        }
//        sqlManager.insert(batch.get(0), true);
        sqlManager.insertBatch(Link111.class, batch);
    }

    public static Obj do11_2(Arr compNames) {
        //返回所有公司的法人
        var ret = o();
        for (QccDetails qccDetails : sqlManager.lambdaQuery(QccDetails.class)
            .andIn(QccDetails::getInner_company_name, compNames)
            .select(QccDetails::getOper_name, QccDetails::getInner_company_name)) {
            ret.put(qccDetails.getInner_company_name(), qccDetails.getOper_name());
        }
        return ret;
    }

    public static void do11_3(String compName) {
        sqlManager.lambdaQuery(Link111.class)
            .andEq(Link111::getLink_rule, "11.3")
            .andEq(Link111::getOrigin_name, compName)
            .delete();
        var arr = getCompanyHolders(compName);
        //控股25%以上的公司列表
        for (String s : arr.toStrArr()) {
            var list = sqlManager.lambdaQuery(QccHoldingCompanyNames.class)
                .andEq(QccHoldingCompanyNames::getInner_company_name, s)
                .select(QccHoldingCompanyNames::getName, QccHoldingCompanyNames::getPercent_total)
                .stream()
                .filter(q -> {
                    //只保留25%以上的
                    try {
                        var percent = new BigDecimal(q.getPercent_total().replace("%", ""));
                        return percent.floatValue() >= 25;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return false;
                })
                .map(p -> p.getName())
                .distinct()
                .collect(Collectors.toList());

            var batch = hasLoan(list)
                .toStrList()
                .stream()
                .map(e -> {
                    Link111 link111 = new Link111();
                    link111.setId(IdUtil.objectId());
                    link111.setLink_rule("11.3");
                    link111.setOrigin_name(compName);
                    link111.setLink_left(compName);
                    link111.setLink_right(e);
                    link111.setLink_type("企业:" + s);
                    link111.setIs_company(1);
                    return link111;
                })
                .collect(Collectors.toList());
            if (batch.size() > 0) {
                sqlManager.insertBatch(Link111.class, batch);
            }
        }

    }


    public static void do11_4(String compName) {
        var arr = getCompanyHolders(compName);
        //检查在我行是否有贷款
        var names = hasLoan(arr.toStrList());
        //插入关联集团
        var batch = names.toStrList().stream()
            .map(e -> {
                Link111 link111 = new Link111();
                link111.setId(IdUtil.objectId());
                link111.setLink_rule("11.4");
                link111.setOrigin_name(compName);
                link111.setLink_left(compName);
                link111.setLink_right(e);
                link111.setLink_type("企业股东");
                link111.setIs_company(1);
                return link111;
            })
            .collect(Collectors.toList());
        if (batch.size() > 0) {
            sqlManager.lambdaQuery(Link111.class)
                .andEq(Link111::getLink_rule, "11.4")
                .andEq(Link111::getOrigin_name, compName)
                .delete();
            sqlManager.insertBatch(Link111.class, batch);
        }

    }

    /**
     * 前置
     * @param name
     * @param isCompany
     */
    public static void do11_5_1(String name, boolean isCompany) {
        var cusids = a();
        if (isCompany) {
            var com = sqlManager.lambdaQuery(CusCom.class)
                .andEq(CusCom::getCus_name, name)
                .select(CusCom::getCus_id);
            for (CusCom cusCom : com) {
                cusids.add(cusCom.getCus_id());
            }

        } else {
            var indiv = sqlManager.lambdaQuery(CusIndiv.class)
                .andEq(CusIndiv::getCus_name, name)
                .select(CusIndiv::getCus_id);
            for (CusIndiv cusIndiv : indiv) {
                cusids.add(cusIndiv.getCus_id());
            }
        }
        var rptlist = sqlManager.lambdaQuery(RptMRptSlsAcct.class)
            .andIn(RptMRptSlsAcct::getCus_id, cusids)
            .select(RptMRptSlsAcct::getLoan_account)
            .stream()
            .map(e -> e.getLoan_account())
            .collect(Collectors.toList());
        if (rptlist.size() == 0) {
            return;
        }
        List<Obj> diyas = sqlManager.select("accloan.04", Obj.class, o("loans", rptlist));
        var total = new BigDecimal(0);
        for (Obj diya : diyas) {
            try {
                total = total.add(diya.getBigDecimal("core_value"));
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }
        }
        if (total.compareTo(BigDecimal.ZERO) == 0) {
            return;
        }
        var limit = new BigDecimal("0.33333");
        BigDecimal finalTotal = total;
        var batch = diyas
            .stream()
            .filter(e -> {
                try {
                    return (e.getBigDecimal("core_value").divide(finalTotal).compareTo(limit) >= 0);
                } catch (Exception ee) {
                    return false;
                }
            })
            .map(e -> e.getStr("cus_id") + "|" + e.getStr("guar_name"))
            .distinct()
            .map(e -> {
                var link = new Link111();
                link.setId(IdUtil.objectId());
                link.setLink_rule("11.5.1");
                link.setOrigin_name(name);
                link.setLink_left(name);
                link.setLink_right(e);
                link.setLink_type("担保人");
                link.setIs_company(isCompany ? 1 : 0);
                return link;
            })
            .collect(Collectors.toList());
        if (batch.size() > 0) {
            sqlManager.lambdaQuery(Link111.class)
                .andEq(Link111::getOrigin_name, name)
                .andEq(Link111::getIs_company, isCompany ? 1 : 0)
                .andEq(Link111::getLink_rule, "11.5.1")
                .delete();
            sqlManager.insertBatch(Link111.class, batch);
        }

    }


    public static void do11_5(String compName) {
        var diyas = sqlManager.lambdaQuery(Link111.class)
            .andEq(Link111::getLink_rule, "11.5.1")
            .andEq(Link111::getOrigin_name, compName)
            .select();
        var batch = a();
        for (Link111 diya : diyas) {
            var p = diya.getLink_right().split("\\|");
            if (p.length != 2) {
                continue;
            }
            var loans = sqlManager.lambdaQuery(RptMRptSlsAcct.class)
                .andEq(RptMRptSlsAcct::getCus_id, p[0])
                .select(RptMRptSlsAcct::getCus_name);
            for (RptMRptSlsAcct loan : loans) {
                if (loan.getCus_name().equals(compName)) {
                    continue;
                }
                var link = new Link111();
                link.setId(IdUtil.objectId());
                link.setLink_rule("11.5");
                link.setOrigin_name(compName);
                link.setLink_type("担保关联");
                link.setLink_left(compName);
                link.setLink_right(loan.getCus_name());
                link.setIs_company(1);
                batch.add(link);
            }
        }
        if (batch.isNotEmpty()) {
            sqlManager.lambdaQuery(Link111.class)
                .andEq(Link111::getLink_rule, "11.5")
                .andEq(Link111::getOrigin_name, compName)
                .delete();
            sqlManager.insertBatch(Link111.class, batch);
        }
    }


    public static void do11_6(String compName){
        var diyas = sqlManager.lambdaQuery(Link111.class)
            .andEq(Link111::getLink_rule, "11.5.1")
            .andEq(Link111::getOrigin_name, compName)
            .select();
        var batch = a();
        for (Link111 diya : diyas) {
            var p = diya.getLink_right().split("\\|");
            if(p.length != 2){
                continue;
            }
            //todo: 这里可能需要换成存量对公的客户
            var count = sqlManager.lambdaQuery(RptMRptSlsAcct.class)
                .andEq(RptMRptSlsAcct::getCus_id, p[0])
                .count();
            if(count > 0){
                var link = new Link111() ;
                link.setId(IdUtil.objectId());
                link.setLink_rule("11.6");
                link.setLink_left(compName);
                link.setOrigin_name(compName);
                link.setLink_right(p[1]);
                link.setLink_type("担保关联");
                link.setIs_company(1);
                batch.add(link);
            }
        }
        if(batch.isNotEmpty()){
            sqlManager.lambdaQuery(Link111.class)
                .andEq(Link111::getLink_rule, "11.6")
                .andEq(Link111::getOrigin_name, compName)
                .delete();
            sqlManager.insertBatch(Link111.class, batch);
        }
    }

    /**
     * 检查某些公司是否在我行有贷款
     * @param compNames
     */
    private static Arr hasLoan(Collection<String> names) {
        var allows = sqlManager.lambdaQuery(CusComList.class)
            .andIn(CusComList::getCus_name, names)
            .select();
        return a(allows.stream()
            .map(e -> e.getCus_name())
            .toArray()
        );
    }

    /**
     * 得到某个公司控股持股25%以上的股东
     * @return
     */
    private static Arr getCompanyHolders(String compName) {
        var arr = a();
        //持股25%以上的企业股东
        var ps = sqlManager.lambdaQuery(QccDetailsPartners.class)
            .andEq(QccDetailsPartners::getInner_company_name, compName)
            .andEq(QccDetailsPartners::getStock_type, "企业法人")
            .select();
        for (QccDetailsPartners p : ps) {
            try {
                var percent = new BigDecimal(p.getStock_percent().replace("%", ""));
                if (percent.floatValue() >= 25) {
                    arr.add(p.getStock_name());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arr;
    }


    private static BigDecimal convertToMoney(String str) {
        var sstr = str.replaceAll("人民币", "");
        BigDecimal bg = null;
        if (sstr.contains("万")) {
            sstr = sstr.replaceAll("万港?美?元?|\\s+", "");
            bg = new BigDecimal(sstr);
            bg = bg.multiply(new BigDecimal(1000));
        } else {
            bg = new BigDecimal(sstr);
        }
        return bg;
    }
}
