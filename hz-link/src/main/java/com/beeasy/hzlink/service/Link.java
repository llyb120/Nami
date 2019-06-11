package com.beeasy.hzlink.service;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.beeasy.hzlink.model.*;
import com.github.llyb120.nami.core.Arr;
import com.github.llyb120.nami.core.Json;
import com.github.llyb120.nami.core.Obj;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import static com.github.llyb120.nami.core.DBService.sqlManager;
import static com.github.llyb120.nami.core.Json.*;

public class Link {

    public static void do11_1(String compName) {
        var ret = a();
        //企业基本信息
//        var detail = sqlManager.lambdaQuery(QccDetails.class)
//            .andEq(QccDetails::getInner_company_name, compName)
//            .single();
//        if (detail == null) {
//            return;
//        }
        var arr = new LinkedHashSet<String>();
        var detail = getCompanyDetail(compName);
        if (detail == null) {
            return;
        }
        arr.add(detail.getStr("OperName"));

        //主要人员
        var ps = detail.getArr("Employees");
        for (Obj obj : ps.toObjList()) {
            if(obj.getStr("Job","").contains("董事")){
                arr.add(obj.getStr("Name"));
            }
        }

//        var ps = sqlManager.lambdaQuery(QccDetailsEmployees.class)
//            .andEq(QccDetailsEmployees::getInner_company_name, compName)
//            .andLike(QccDetailsEmployees::getJob, "%董事%")
//            .select(QccDetailsEmployees::getName);

        //股东
        var dps = detail.getArr("Partners");
        for (Obj obj : dps.toObjList()) {
            if(!obj.getStr("StockType", "").equals("自然人股东")){
                continue;
            }
            //算不出来的一概忽略
            try {
                var p = Float.parseFloat(obj.getStr("StockPercent").replaceAll("%", ""));
                if (p >= 25) {
                    arr.add(obj.getStr("StockName"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

//        var dps = sqlManager.lambdaQuery(QccDetailsPartners.class)
//            .andEq(QccDetailsPartners::getInner_company_name, compName)
//            .andEq(QccDetailsPartners::getStock_type, "自然人股东")
//            .select();
//
//        //加入法人
////        arr.add(detail.getOper_name());
//        //加入董事
////        for (QccDetailsEmployees p : ps) {
////            arr.add(p.getName());
////        }
//        //加入持股25%以上的自然人股东
//        for (QccDetailsPartners dp : dps) {
//            //算不出来的一概忽略
//            try {
//                var p = Float.parseFloat(dp.getStock_percent().replaceAll("%", ""));
//                if (p >= 25) {
//                    arr.add(dp.getStock_name());
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
        //移除空的项目
        arr.removeIf(p -> StrUtil.isEmptyIfStr(p));

        if (arr.size() == 0) {
            return;
        }

        //检查董监高
        for (String s : arr) {
            var cia = getCia(compName, s);
            if (cia != null) {
                for (Obj ciaCompanyLegals : cia.getArr("CIACompanyLegals").toObjList()) {
                    ret.add(a(ciaCompanyLegals.getStr("Name"), ciaCompanyLegals.getStr(""), "法人"));
                }
                for (Obj ciaForeignOffices : cia.getArr("CIAForeignOffices").toObjList()) {
                    if(ciaForeignOffices.getStr("Position", "").contains("董事")){
                        ret.add(a(ciaForeignOffices.getStr("Name"), s, "董事"));
                    }
                }
                for (Obj ciaForeignInvestments : cia.getArr("CIAForeignInvestments").toObjList()) {
                    //算不出来的一概忽略
                    try {
                        var val = ciaForeignInvestments.getStr("SubConAmt");
                        if (val.contains(",")) {
                            var items = StrUtil.splitTrim(val, ",");
                            var i = new BigDecimal(0);
                            for (String item : items) {
                                i.add(new BigDecimal(item));
                            }
                            val = i.toString();
                        }
                        var percent = convertToMoney(val + "万").divide(convertToMoney(ciaForeignInvestments.getStr("RegCap")), 2);
                        if (percent.floatValue() >= 0.25) {
                            ret.add(a(ciaForeignInvestments.getStr("Name"), s, "自然人股东", percent.multiply(new BigDecimal(100))));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        //担任法人
//        var dfaren = sqlManager.lambdaQuery(QccCiaCompanyLegals.class)
//            .andEq(QccCiaCompanyLegals::getInner_company_name, compName)
//            .andIn(QccCiaCompanyLegals::getPer_name, arr)
//            .select(QccCiaCompanyLegals::getName, QccCiaCompanyLegals::getPer_name);
//        for (QccCiaCompanyLegals qccCiaCompanyLegals : dfaren) {
//            ret.add(a(qccCiaCompanyLegals.getName(), qccCiaCompanyLegals.getPer_name(), "法人"));
//        }
//        //担任董事
//        var dongshi = sqlManager.lambdaQuery(QccCiaForeignOffices.class)
//            .andEq(QccCiaForeignOffices::getInner_company_name, compName)
//            .andIn(QccCiaForeignOffices::getPer_name, arr)
//            .andLike(QccCiaForeignOffices::getPosition, "%董事%")
//            .select(QccCiaForeignOffices::getName, QccCiaForeignOffices::getPer_name);
//        for (QccCiaForeignOffices qccCiaForeignOffices : dongshi) {
//            ret.add(a(qccCiaForeignOffices.getName(), qccCiaForeignOffices.getPer_name(), "董事"));
//        }
//        //25%以上的自然人股东
//        var gudong = sqlManager.lambdaQuery(QccCiaForeignInvestments.class)
//            .andEq(QccCiaForeignInvestments::getInner_company_name, compName)
//            .andIn(QccCiaForeignInvestments::getPer_name, arr)
//            .select();
//        for (QccCiaForeignInvestments qccCiaForeignInvestments : gudong) {
//            //有的没数据，忽略
//            if (StrUtil.isNotBlank(qccCiaForeignInvestments.getReg_cap()) && StrUtil.isNotBlank(qccCiaForeignInvestments.getSub_con_amt())) {
//                //算不出来的一概忽略
//                try {
//                    var val = qccCiaForeignInvestments.getSub_con_amt();
//                    if (val.contains(",")) {
//                        var items = StrUtil.splitTrim(val, ",");
//                        var i = new BigDecimal(0);
//                        for (String item : items) {
//                            i.add(new BigDecimal(item));
//                        }
//                        val = i.toString();
//                    }
//                    var percent = convertToMoney(val + "万").divide(convertToMoney(qccCiaForeignInvestments.getReg_cap()), 2);
//                    if (percent.floatValue() >= 0.25) {
//                        ret.add(a(qccCiaForeignInvestments.getName(), qccCiaForeignInvestments.getPer_name(), "自然人股东", percent.multiply(new BigDecimal(100))));
//                    }
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }

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
            if(objects.size() > 3){
                link111.setStock_percent(objects.getBigDecimal(3));
            }
            cache.put(key, true);
            batch.add(link111);
        }
//        sqlManager.insert(batch.get(0), true);
        sqlManager.insertBatch(Link111.class, batch);
    }

    public static void do11_2(String compNames) {
        var str = HttpUtil.get("http://47.96.98.198:8081/ECIV4/GetDetailsByName", o("fullName", compNames));
        var obj = Json.parseObject(str);
        var operName = "";
        if(obj.getStr("Status", "500").equals("200")){
            operName = obj.getObj("Result").getStr("OperName");
        }
        if(!"".equals(operName)){
            CusCom cusCom = sqlManager.lambdaQuery(CusCom.class).andEq(CusCom::getCus_name,compNames).single();
            if(cusCom != null ){
                String legalName = cusCom.getLegal_name();
                // 法人不一致，发送消息提醒
                if(!operName.equals(legalName)){
                    var user = sqlManager.lambdaQuery(TUser.class).andEq(TUser::getAcc_code,cusCom.getCust_mgr()).single();

                    TSystemNotice notice = new TSystemNotice();
                    notice.setId(IdUtil.createSnowflake(0,0).nextId());
                    notice.setState("UNREAD");
                    notice.setType("SYSTEM");
                    notice.setUser_id(user.getId());
                    notice.setContent(compNames + "企业法人有变动！");
                    notice.setBind_data(JSON.toJSONString(null));
                    notice.setAdd_time(new Date());
                    sqlManager.insert(notice, true);
                }else{
                    String certCode = cusCom.getCert_code();
                    var p = sqlManager.lambdaQuery(RptMRptSlsAcct.class).andEq(RptMRptSlsAcct::getEnt_cert_code, certCode).andEq(RptMRptSlsAcct::getCus_name, operName).select();
                    if(null != p && !p.isEmpty()){
                        Link111 link111 = new Link111();
                        link111.setOrigin_name(compNames);
                        link111.setId(IdUtil.objectId());
                        link111.setLink_left(compNames);
                        link111.setLink_right(certCode + "|" +operName);
                        link111.setLink_type("自然人");
                        link111.setLink_rule("11.2");
                        link111.setIs_company(1);
                        sqlManager.insert(link111, true);
                    }
                }
            }
        }
//        //返回所有公司的法人
//        var ret = o();
//        for (QccDetails qccDetails : sqlManager.lambdaQuery(QccDetails.class)
//            .andIn(QccDetails::getInner_company_name, compNames)
//            .select(QccDetails::getOper_name, QccDetails::getInner_company_name)) {
//            ret.put(qccDetails.getInner_company_name(), qccDetails.getOper_name());
//        }
//        return ret;

    }

    public static void do11_3(String compName) {
        System.out.println("do11_3:" + compName);
        var batch = a();
        var arr = getCompanyHolders(compName);
        //控股25%以上的公司列表
        for (String s : arr.toStrArr()) {
            var page = 1;
            while (true) {
                var list = getHoldingCompany(compName, page++);
                if (list == null) {
                    break;
                }
                for (Obj names : list.getArr("Names").toObjList()) {
                    try {
                        var percent = new BigDecimal(names.getStr("PercentTotal", "").replace("%", ""));
                        if (percent.floatValue() >= 25) {
                            Link111 link111 = new Link111();
                            link111.setId(IdUtil.objectId());
                            link111.setLink_rule("11.3");
                            link111.setOrigin_name(compName);
                            link111.setLink_left(compName);
                            link111.setLink_right(names.getStr("Name"));
                            link111.setLink_type("企业:" + s);
                            link111.setIs_company(1);
                            link111.setStock_percent(percent);
                            batch.add(link111);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        if (batch.isNotEmpty()) {
            sqlManager.lambdaQuery(Link111.class)
                .andEq(Link111::getLink_rule, "11.3")
                .andEq(Link111::getOrigin_name, compName)
                .delete();
            sqlManager.insertBatch(Link111.class, batch);
        }

//            var list = sqlManager.lambdaQuery(QccHoldingCompanyNames.class)
//                .andEq(QccHoldingCompanyNames::getInner_company_name, s)
//                .select(QccHoldingCompanyNames::getName, QccHoldingCompanyNames::getPercent_total)
//                .stream()
//                .filter(q -> {
//                    //只保留25%以上的
//                    try {
//                        var percent = new BigDecimal(q.getPercent_total().replace("%", ""));
//                        return percent.floatValue() >= 25;
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                    return false;
//                })
//                .map(p -> p.getName())
//                .distinct()
//                .collect(Collectors.toList());
//
//            var batch = hasLoan(list)
//                .toStrList()
//                .stream()
//                .map(e -> {
//                    Link111 link111 = new Link111();
//                    link111.setId(IdUtil.objectId());
//                    link111.setLink_rule("11.3");
//                    link111.setOrigin_name(compName);
//                    link111.setLink_left(compName);
//                    link111.setLink_right(e);
//                    link111.setLink_type("企业:" + s);
//                    link111.setIs_company(1);
//                    return link111;
//                })
//                .collect(Collectors.toList());
//            if (batch.size() > 0) {
//                sqlManager.insertBatch(Link111.class, batch);
//            }

    }


    public static void do11_4(String compName) {
        var arr = getCompanyHolders(compName);
        if(arr.isEmpty()){
            return;
        }
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


    public static void do12_2(String compName){
        //企业基本信息
        var detail = getCompanyDetail(compName);
        if (detail == null) {
            return;
        }
        var batch = a();
        batch.add(new Link111(){
            {
                setLink_rule("12.2");
                setIs_company(1);
                setId(IdUtil.objectId());
                setLink_type("法人");
                setOrigin_name(compName);
                setLink_left(compName);
                setLink_right(detail.getStr("OperName"));
            }
        });

        //主要人员
        var ps = detail.getArr("Employees");
        for (Obj obj : ps.toObjList()) {
            if(obj.getStr("Job","").contains("董事")){
                batch.add(new Link111(){
                    {
                        setLink_rule("12.2");
                        setIs_company(1);
                        setId(IdUtil.objectId());
                        setLink_type("董事");
                        setOrigin_name(compName);
                        setLink_left(compName);
                        setLink_right(obj.getStr("Name"));
                    }
                });
            }
        }

        var dps = detail.getArr("Partners");
        for (Obj obj : dps.toObjList()) {
            //算不出来的一概忽略
            try {
                var p = new BigDecimal(obj.getStr("StockPercent").replaceAll("%", ""));
                if (p.floatValue() >= 25) {
                    batch.add(new Link111(){{
                        setLink_rule("12.2");
                        setIs_company(1);
                        setId(IdUtil.objectId());
                        setLink_type("自然人股东");
                        setOrigin_name(compName);
                        setLink_left(compName);
                        setLink_right(obj.getStr("Name"));
                        setStock_percent(p);
                    }});
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if(batch.isNotEmpty()){
            sqlManager.lambdaQuery(Link111.class)
                .andEq(Link111::getLink_rule, "12.2")
                .andEq(Link111::getOrigin_name, compName)
                .delete();
            sqlManager.insertBatch(Link111.class, batch);
        }

    }


    public static void do12_3(String compName){
        var detail = getCompanyDetail(compName);
        if (detail == null) {
            return;
        }
        var batch = a();
        for (Obj obj : detail.getArr("Partners").toObjList()) {
            if(!obj.getStr("StockType","").equals("企业法人")){
                continue;
            }
            //算不出来的一概忽略
            try {
                var p = new BigDecimal(obj.getStr("StockPercent").replaceAll("%", ""));
                if (p.floatValue() >= 25) {
                    batch.add(new Link111(){{
                        setLink_rule("12.3");
                        setIs_company(1);
                        setId(IdUtil.objectId());
                        setLink_type("企业股东");
                        setOrigin_name(compName);
                        setLink_left(compName);
                        setLink_right(obj.getStr("Name"));
                        setStock_percent(p);
                    }}) ;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        if(batch.isNotEmpty()){
            sqlManager.lambdaQuery(Link111.class)
                .andEq(Link111::getLink_rule, "12.3")
                .andEq(Link111::getOrigin_name, compName)
                .delete();
            sqlManager.insertBatch(Link111.class, batch);
        }

    }

    public static void do12_4(String compName){
        var page = 1;
        var batch = a();
        while(true){
            var holdings = getHoldingCompany(compName, page++);
            if (holdings == null) {
                break;
            }
            for (Obj names : holdings.getArr("Names").toObjList()) {
                try {
                    var percent = new BigDecimal(names.getStr("PercentTotal", "").replace("%", ""));
                    if (percent.floatValue() >= 25) {
                        Link111 link111 = new Link111();
                        link111.setId(IdUtil.objectId());
                        link111.setLink_rule("12.4");
                        link111.setOrigin_name(compName);
                        link111.setLink_left(compName);
                        link111.setLink_right(names.getStr("Name"));
                        link111.setLink_type("控股公司");
                        link111.setIs_company(1);
                        link111.setStock_percent(percent);
                        batch.add(link111);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if(batch.isNotEmpty()){
            sqlManager.lambdaQuery(Link111.class)
                .andEq(Link111::getOrigin_name, compName)
                .andEq(Link111::getLink_rule, "12.4")
                .delete();
            sqlManager.insertBatch(Link111.class, batch);
        }
    }

    public static void do12_5(String partners, String IDCard){
        var lists = sqlManager.lambdaQuery(CusCom.class).andEq(CusCom::getLegal_name, partners).andEq(CusCom::getLegal_cert_code, IDCard).select();
        if(null == lists || lists.isEmpty()){
            // 判断是否是关联方数据中的关联人
            var linkList = sqlManager.lambdaQuery(Link111.class).andEq(Link111::getLink_right, IDCard + "|"+partners).select();
            if(null == linkList || linkList.isEmpty()){
                return;
            }else{
                for(Link111 link: linkList){
                    var company = link.getLink_left();

                }
            }
        }else{
            for(CusCom list : lists){

            }
        }

    }

    /**
     * 检查某些公司是否在我行有贷款
     * @param compNames
     */
    private static Arr hasLoan(Collection<String> names) {
        List<Obj> allows = sqlManager.select("accloan.存量对公客户", Obj.class, o("names", names));
//        var allows = sqlManager.lambdaQuery(CusComList.class)
//            .andIn(CusComList::getCus_name, names)
//            .select();
        return a(allows.stream()
            .map(e -> e.getStr("cus_name"))
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
        var detail = getCompanyDetail(compName);
        if (detail == null) {
            return arr;
        }
        for (Obj obj : detail.getArr("Partners").toObjList()) {
            if(!obj.getStr("StockType","").equals("企业法人")){
                continue;
            }
            //算不出来的一概忽略
            try {
                var p = Float.parseFloat(obj.getStr("StockPercent").replaceAll("%", ""));
                if (p >= 25) {
                    arr.add(obj.getStr("StockName"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

//        var ps = sqlManager.lambdaQuery(QccDetailsPartners.class)
//            .andEq(QccDetailsPartners::getInner_company_name, compName)
//            .andEq(QccDetailsPartners::getStock_type, "企业法人")
//            .select();
//        for (QccDetailsPartners p : ps) {
//            try {
//                var percent = new BigDecimal(p.getStock_percent().replace("%", ""));
//                if (percent.floatValue() >= 25) {
//                    arr.add(p.getStock_name());
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
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

    private static Obj getCompanyDetail(String compName){
        try{
            var str = HttpUtil.get("http://47.96.98.198:8081/ECIV4/GetDetailsByName", o("fullName", compName));
            return (Obj) Json.parseObject(str).getByPath("Result");
        } catch (Exception e){
            return null;
        }
    }

    private static Obj getCia(String compName, String perName){
        try{
            var str = HttpUtil.get("http://47.96.98.198:8081/CIAEmployeeV4/GetStockRelationInfo", o("fullName", compName, "personName", perName));
            return (Obj) Json.parseObject(str).getByPath("Result");
        } catch (Exception e){
            return null;
        }
    }


    private static Obj getHoldingCompany(String compName, int page){
        try{
            var str = HttpUtil.get("http://47.96.98.198:8081/HoldingCompany/GetHoldingCompany", o("fullName", compName, "paegIndex", page, "pageSize", 100));
            var obj = (Obj) Json.parseObject(str);
            var paging = obj.getObj("Paging");
            //没有下一页了
            if(paging.getIntValue("TotalRecords") / 100 + 1 < page){
                return null;
            }
            return (Obj) obj.getByPath("Result");
        }
        catch (Exception e){
            return null;
        }
    }
}
