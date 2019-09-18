package com.github.llyb120.nami;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.io.IoUtil;
import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import com.github.llyb120.nami.json.Arr;
import com.github.llyb120.nami.json.Json;
import com.github.llyb120.nami.json.Obj;
import com.github.llyb120.nami.json.TypeReference;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.github.llyb120.nami.json.Json.*;

public class TestJson {

    @Test
    public void test(){
        boolean b = StrUtil.isBlank(" \n");
        StringBuilder sb = new StringBuilder();
        String str = RandomUtil.randomString(1024);
        long stime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < 100; j++) {

            }
            str.substring(500, 600);
        }
        System.out.println(System.currentTimeMillis() - stime);
        stime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            sb.setLength(0);
            for (int j = 0; j < 100; j++) {
                sb.append(str.charAt(500 + j));
            }
            sb.toString();
        }
        System.out.println(System.currentTimeMillis() - stime);
    }


    public static class FFF{
        public int a = 1;
        public double b = 2;
        private int fuck = 0;

        public FFF(int fuck){
            this.fuck = fuck;
        }
        public int getFuck(){
            return 1;
        }

        public void getFuck2(){
            return;
        }

//        public void setFuck(int val){
//            fuck = val;
//        }
    }
    @Test
    public void test_01_decode() throws IOException {
        Obj a = Json.parse(IoUtil.readBytes(new ClassPathResource("test/test.json").getStream()));
        a.put("fuck",22);
        FFF f2 = new FFF(1234);
        a.put("f2", f2);
        a.put("date", new Date());
//        f2.setFuck(123);
        String str = Json.stringify(a);
        Obj f4 = Json.parse(str);
        Object f22 =  f4.get("f2");
        FFF f3 = Convert.convert(FFF.class, f22);
        int b = 1;
    }


    @Test
    public void test_99_simple(){
        Json json = Json.parse("[1,2,3]");
        Object a = json.to(int[].class);
        Json c = Json.toJson(a);
        int b = 2;
    }


    @Test
    public void fff(){
        Obj a = o("fuck", new HashMap(){{
            put("fuck", 1);
        }});
        Obj b = a.o("fuck");
        a.toString();
    }

    @Test
    public void testThreadSafe(){
        Obj a = o("b", 1, "a", 2);;
        a.forEach((k,v) -> System.out.println(k));
    }


    @Test
    public void testtree(){
        String str = "[{\"_id\":\"5d33e7a6ae3ae6736c1e22e4\",\"text\":\"新分类\"},{\"_id\":\"5d33f3cbeb9ec954a0cfcdc7\",\"text\":\"新分类\",\"pid\":\"5d33e7a6ae3ae6736c1e22e4\"},{\"_id\":\"5d33f3d0eb9ec954a0cfcdc8\",\"text\":\"新分类\",\"pid\":\"5d33f3cbeb9ec954a0cfcdc7\"}]";
    }


    @Test
    public void testTypeRef() throws IllegalAccessException, InstantiationException {
        String json =
                "{\n" +
                        "  \"nodes\": {\n" +
                        "    \"Task_0nvfot8\": {\n" +
                        "      \"condition\": [],\n" +
                        "      \"quanxian\": [\n" +
                        "        \"allowBack\"\n" +
                        "      ],\n" +
                        "      \"permission\": {\n" +
                        "        \"rs\": [],\n" +
                        "        \"qs\": [\n" +
                        "          \"惠州农村商业银行-办公室-总行经理\"\n" +
                        "        ],\n" +
                        "        \"ps\": [],\n" +
                        "        \"qids\": [\n" +
                        "          \"1000725\"\n" +
                        "        ],\n" +
                        "        \"rids\": [],\n" +
                        "        \"dids\": [],\n" +
                        "        \"pids\": [],\n" +
                        "        \"ds\": []\n" +
                        "      },\n" +
                        "      \"fields\": {\n" +
                        "        \"all_fields\": [\n" +
                        "          \"贷审会主任委员同意与否\",\n" +
                        "          \"贷审会主任委员具体意见\"\n" +
                        "        ],\n" +
                        "        \"required_fields\": [\n" +
                        "          \"贷审会主任委员同意与否\"\n" +
                        "        ]\n" +
                        "      },\n" +
                        "      \"timeoutSet\": {\n" +
                        "        \"maxTimeout\": \"0\",\n" +
                        "        \"timeout\": \"0\"\n" +
                        "      },\n" +
                        "      \"intelligence\": {}\n" +
                        "    },\n" +
                        "    \"Task_0l2tzcd\": {\n" +
                        "      \"condition\": [],\n" +
                        "      \"quanxian\": [\n" +
                        "        \"allowBack\"\n" +
                        "      ],\n" +
                        "      \"permission\": {\n" +
                        "        \"rs\": [],\n" +
                        "        \"qs\": [\n" +
                        "          \"惠州农村商业银行-计划财务部-总行办事员\"\n" +
                        "        ],\n" +
                        "        \"ps\": [],\n" +
                        "        \"qids\": [\n" +
                        "          \"1000737\"\n" +
                        "        ],\n" +
                        "        \"rids\": [],\n" +
                        "        \"dids\": [],\n" +
                        "        \"pids\": [],\n" +
                        "        \"ds\": []\n" +
                        "      },\n" +
                        "      \"fields\": {\n" +
                        "        \"all_fields\": [\n" +
                        "          \"贷款机构同意与否\",\n" +
                        "          \"贷款机构具体意见\"\n" +
                        "        ],\n" +
                        "        \"required_fields\": [\n" +
                        "          \"贷款机构同意与否\"\n" +
                        "        ]\n" +
                        "      },\n" +
                        "      \"timeoutSet\": {\n" +
                        "        \"maxTimeout\": \"0\",\n" +
                        "        \"timeout\": \"0\"\n" +
                        "      },\n" +
                        "      \"intelligence\": {}\n" +
                        "    },\n" +
                        "    \"Task_1d1tz7l\": {\n" +
                        "      \"condition\": [],\n" +
                        "      \"quanxian\": [\n" +
                        "        \"allowBack\"\n" +
                        "      ],\n" +
                        "      \"permission\": {\n" +
                        "        \"rs\": [],\n" +
                        "        \"qs\": [\n" +
                        "          \"惠州农村商业银行-合规与风险管理部-总行办事员\"\n" +
                        "        ],\n" +
                        "        \"ps\": [],\n" +
                        "        \"qids\": [\n" +
                        "          \"1000767\"\n" +
                        "        ],\n" +
                        "        \"rids\": [],\n" +
                        "        \"dids\": [],\n" +
                        "        \"pids\": [],\n" +
                        "        \"ds\": []\n" +
                        "      },\n" +
                        "      \"fields\": {\n" +
                        "        \"all_fields\": [\n" +
                        "          \"贷审组同意与否\",\n" +
                        "          \"贷审组具体意见\"\n" +
                        "        ],\n" +
                        "        \"required_fields\": [\n" +
                        "          \"贷审组同意与否\"\n" +
                        "        ]\n" +
                        "      },\n" +
                        "      \"timeoutSet\": {\n" +
                        "        \"maxTimeout\": \"0\",\n" +
                        "        \"timeout\": \"0\"\n" +
                        "      },\n" +
                        "      \"intelligence\": {}\n" +
                        "    },\n" +
                        "    \"Task_0alyrrj\": {\n" +
                        "      \"condition\": [],\n" +
                        "      \"quanxian\": [\n" +
                        "        \"allowBack\"\n" +
                        "      ],\n" +
                        "      \"permission\": {\n" +
                        "        \"rs\": [],\n" +
                        "        \"qs\": [\n" +
                        "          \"惠州农村商业银行-工会办公室-总行总经理\"\n" +
                        "        ],\n" +
                        "        \"ps\": [],\n" +
                        "        \"qids\": [\n" +
                        "          \"1000733\"\n" +
                        "        ],\n" +
                        "        \"rids\": [],\n" +
                        "        \"dids\": [],\n" +
                        "        \"pids\": [],\n" +
                        "        \"ds\": []\n" +
                        "      },\n" +
                        "      \"fields\": {\n" +
                        "        \"all_fields\": [\n" +
                        "          \"行长同意与否\",\n" +
                        "          \"行长意见\"\n" +
                        "        ],\n" +
                        "        \"required_fields\": [\n" +
                        "          \"行长同意与否\"\n" +
                        "        ]\n" +
                        "      },\n" +
                        "      \"timeoutSet\": {\n" +
                        "        \"maxTimeout\": \"0\",\n" +
                        "        \"timeout\": \"0\"\n" +
                        "      },\n" +
                        "      \"intelligence\": {}\n" +
                        "    },\n" +
                        "    \"Task_0q83ar6\": {\n" +
                        "      \"condition\": [],\n" +
                        "      \"quanxian\": [\n" +
                        "        \"allowUpload\",\n" +
                        "        \"allowBack\"\n" +
                        "      ],\n" +
                        "      \"permission\": {\n" +
                        "        \"rs\": [],\n" +
                        "        \"qs\": [\n" +
                        "          \"惠州农村商业银行-人力资源部-总行办事员\"\n" +
                        "        ],\n" +
                        "        \"ps\": [],\n" +
                        "        \"qids\": [\n" +
                        "          \"1000732\"\n" +
                        "        ],\n" +
                        "        \"rids\": [],\n" +
                        "        \"dids\": [],\n" +
                        "        \"pids\": [],\n" +
                        "        \"ds\": []\n" +
                        "      },\n" +
                        "      \"fields\": {\n" +
                        "        \"all_fields\": [\n" +
                        "          \"资料移交岗同意与否\",\n" +
                        "          \"资料移交岗具体意见\"\n" +
                        "        ],\n" +
                        "        \"required_fields\": [\n" +
                        "          \"资料移交岗同意与否\"\n" +
                        "        ]\n" +
                        "      },\n" +
                        "      \"timeoutSet\": {\n" +
                        "        \"maxTimeout\": \"0\",\n" +
                        "        \"timeout\": \"0\"\n" +
                        "      },\n" +
                        "      \"intelligence\": {}\n" +
                        "    },\n" +
                        "    \"Task_1rtduak\": {\n" +
                        "      \"condition\": [],\n" +
                        "      \"quanxian\": [\n" +
                        "        \"allowBack\"\n" +
                        "      ],\n" +
                        "      \"permission\": {\n" +
                        "        \"rs\": [\n" +
                        "          \"基础角色\"\n" +
                        "        ],\n" +
                        "        \"qs\": [\n" +
                        "          \"惠州农村商业银行-惠州农村商业银行惠城支行-惠城支行市场部-客户经理\"\n" +
                        "        ],\n" +
                        "        \"ps\": [\n" +
                        "          \"赵大\",\n" +
                        "          \"钱二\"\n" +
                        "        ],\n" +
                        "        \"qids\": [\n" +
                        "          \"1000803\"\n" +
                        "        ],\n" +
                        "        \"rids\": [\n" +
                        "          \"2000007\"\n" +
                        "        ],\n" +
                        "        \"dids\": [],\n" +
                        "        \"pids\": [\n" +
                        "          \"1583\",\n" +
                        "          \"1584\"\n" +
                        "        ],\n" +
                        "        \"ds\": []\n" +
                        "      },\n" +
                        "      \"fields\": {\n" +
                        "        \"all_fields\": [\n" +
                        "          \"市场部同意与否\",\n" +
                        "          \"市场部具体意见\"\n" +
                        "        ],\n" +
                        "        \"required_fields\": [\n" +
                        "          \"市场部同意与否\"\n" +
                        "        ]\n" +
                        "      },\n" +
                        "      \"timeoutSet\": {\n" +
                        "        \"maxTimeout\": \"\",\n" +
                        "        \"timeout\": \"\"\n" +
                        "      },\n" +
                        "      \"intelligence\": {\n" +
                        "        \"targetRule\": \"Task_1rtduak\"\n" +
                        "      }\n" +
                        "    },\n" +
                        "    \"Task_002ar34\": {\n" +
                        "      \"condition\": [],\n" +
                        "      \"quanxian\": [\n" +
                        "        \"allowBack\"\n" +
                        "      ],\n" +
                        "      \"permission\": {\n" +
                        "        \"rs\": [],\n" +
                        "        \"qs\": [\n" +
                        "          \"惠州农村商业银行-公司银行部-总行副总经理（主持全面）\"\n" +
                        "        ],\n" +
                        "        \"ps\": [],\n" +
                        "        \"qids\": [\n" +
                        "          \"7\"\n" +
                        "        ],\n" +
                        "        \"rids\": [],\n" +
                        "        \"dids\": [],\n" +
                        "        \"pids\": [],\n" +
                        "        \"ds\": []\n" +
                        "      },\n" +
                        "      \"fields\": {\n" +
                        "        \"all_fields\": [\n" +
                        "          \"公司银行部分管副行长同意与否\",\n" +
                        "          \"公司银行部分管副行长具体意见\"\n" +
                        "        ],\n" +
                        "        \"required_fields\": [\n" +
                        "          \"公司银行部分管副行长同意与否\"\n" +
                        "        ]\n" +
                        "      },\n" +
                        "      \"timeoutSet\": {\n" +
                        "        \"maxTimeout\": \"0\",\n" +
                        "        \"timeout\": \"0\"\n" +
                        "      },\n" +
                        "      \"intelligence\": {}\n" +
                        "    },\n" +
                        "    \"Task_1ll1flr\": {\n" +
                        "      \"condition\": [\n" +
                        "        {\n" +
                        "          \"a_attr\": {\n" +
                        "            \"href\": \"#\",\n" +
                        "            \"id\": \"1565011240016_anchor\"\n" +
                        "          },\n" +
                        "          \"data\": {},\n" +
                        "          \"li_attr\": {\n" +
                        "            \"id\": \"1565011240016\"\n" +
                        "          },\n" +
                        "          \"children\": [],\n" +
                        "          \"icon\": \"glyphicon glyphicon-file\",\n" +
                        "          \"id\": \"1565011240016\",\n" +
                        "          \"text\": \"[审查岗同意与否]等于'同意'\",\n" +
                        "          \"state\": {\n" +
                        "            \"loaded\": true,\n" +
                        "            \"opened\": false,\n" +
                        "            \"disabled\": false,\n" +
                        "            \"selected\": true\n" +
                        "          },\n" +
                        "          \"type\": \"rule\"\n" +
                        "        }\n" +
                        "      ],\n" +
                        "      \"quanxian\": [\n" +
                        "        \"allowBack\"\n" +
                        "      ],\n" +
                        "      \"permission\": {\n" +
                        "        \"rs\": [],\n" +
                        "        \"qs\": [\n" +
                        "          \"惠州农村商业银行-风险资产管理部-总行办事员\"\n" +
                        "        ],\n" +
                        "        \"ps\": [],\n" +
                        "        \"qids\": [\n" +
                        "          \"1000752\"\n" +
                        "        ],\n" +
                        "        \"rids\": [],\n" +
                        "        \"dids\": [],\n" +
                        "        \"pids\": [],\n" +
                        "        \"ds\": []\n" +
                        "      },\n" +
                        "      \"fields\": {\n" +
                        "        \"all_fields\": [\n" +
                        "          \"风险部同意与否\",\n" +
                        "          \"风险部具体意见\"\n" +
                        "        ],\n" +
                        "        \"required_fields\": [\n" +
                        "          \"风险部同意与否\"\n" +
                        "        ]\n" +
                        "      },\n" +
                        "      \"timeoutSet\": {\n" +
                        "        \"maxTimeout\": \"\",\n" +
                        "        \"timeout\": \"\"\n" +
                        "      },\n" +
                        "      \"intelligence\": {}\n" +
                        "    },\n" +
                        "    \"Task_1i4yrjn\": {\n" +
                        "      \"condition\": [],\n" +
                        "      \"quanxian\": [\n" +
                        "        \"allowBack\"\n" +
                        "      ],\n" +
                        "      \"permission\": {\n" +
                        "        \"rs\": [],\n" +
                        "        \"qs\": [\n" +
                        "          \"惠州农村商业银行-党委副书记\"\n" +
                        "        ],\n" +
                        "        \"ps\": [],\n" +
                        "        \"qids\": [\n" +
                        "          \"1\"\n" +
                        "        ],\n" +
                        "        \"rids\": [],\n" +
                        "        \"dids\": [],\n" +
                        "        \"pids\": [],\n" +
                        "        \"ds\": []\n" +
                        "      },\n" +
                        "      \"fields\": {\n" +
                        "        \"all_fields\": [\n" +
                        "          \"董事长同意与否\",\n" +
                        "          \"董事长意见\"\n" +
                        "        ],\n" +
                        "        \"required_fields\": [\n" +
                        "          \"董事长同意与否\"\n" +
                        "        ]\n" +
                        "      },\n" +
                        "      \"timeoutSet\": {\n" +
                        "        \"maxTimeout\": \"0\",\n" +
                        "        \"timeout\": \"0\"\n" +
                        "      },\n" +
                        "      \"intelligence\": {}\n" +
                        "    },\n" +
                        "    \"Task_00y0pig\": {\n" +
                        "      \"condition\": [],\n" +
                        "      \"quanxian\": [],\n" +
                        "      \"permission\": {\n" +
                        "        \"rs\": [],\n" +
                        "        \"qs\": [\n" +
                        "          \"惠州农村商业银行-公司银行部-总行总经理助理\"\n" +
                        "        ],\n" +
                        "        \"ps\": [],\n" +
                        "        \"qids\": [\n" +
                        "          \"1000755\"\n" +
                        "        ],\n" +
                        "        \"rids\": [],\n" +
                        "        \"dids\": [],\n" +
                        "        \"pids\": [],\n" +
                        "        \"ds\": []\n" +
                        "      },\n" +
                        "      \"fields\": {\n" +
                        "        \"all_fields\": [\n" +
                        "          \"公司银行部负责人同意与否\",\n" +
                        "          \"公司银行部负责人具体意见\"\n" +
                        "        ],\n" +
                        "        \"required_fields\": [\n" +
                        "          \"公司银行部负责人同意与否\"\n" +
                        "        ]\n" +
                        "      },\n" +
                        "      \"timeoutSet\": {\n" +
                        "        \"maxTimeout\": \"0\",\n" +
                        "        \"timeout\": \"0\"\n" +
                        "      },\n" +
                        "      \"intelligence\": {}\n" +
                        "    },\n" +
                        "    \"Task_0t4ae9q\": {\n" +
                        "      \"condition\": [],\n" +
                        "      \"quanxian\": [\n" +
                        "        \"allowBack\"\n" +
                        "      ],\n" +
                        "      \"permission\": {\n" +
                        "        \"rs\": [],\n" +
                        "        \"qs\": [\n" +
                        "          \"惠州农村商业银行-授信管理部-总行办事员\"\n" +
                        "        ],\n" +
                        "        \"ps\": [],\n" +
                        "        \"qids\": [\n" +
                        "          \"1000748\"\n" +
                        "        ],\n" +
                        "        \"rids\": [],\n" +
                        "        \"dids\": [],\n" +
                        "        \"pids\": [],\n" +
                        "        \"ds\": []\n" +
                        "      },\n" +
                        "      \"fields\": {\n" +
                        "        \"all_fields\": [\n" +
                        "          \"授信管理部审查岗同意与否\",\n" +
                        "          \"授信管理部审查岗具体意见\"\n" +
                        "        ],\n" +
                        "        \"required_fields\": [\n" +
                        "          \"授信管理部审查岗同意与否\"\n" +
                        "        ]\n" +
                        "      },\n" +
                        "      \"timeoutSet\": {\n" +
                        "        \"maxTimeout\": \"0\",\n" +
                        "        \"timeout\": \"0\"\n" +
                        "      },\n" +
                        "      \"intelligence\": {}\n" +
                        "    },\n" +
                        "    \"Task_1poinl2\": {\n" +
                        "      \"condition\": [],\n" +
                        "      \"quanxian\": [\n" +
                        "        \"allowBack\"\n" +
                        "      ],\n" +
                        "      \"permission\": {\n" +
                        "        \"rs\": [],\n" +
                        "        \"qs\": [\n" +
                        "          \"惠州农村商业银行-授信管理部-总行经理\"\n" +
                        "        ],\n" +
                        "        \"ps\": [],\n" +
                        "        \"qids\": [\n" +
                        "          \"5\"\n" +
                        "        ],\n" +
                        "        \"rids\": [],\n" +
                        "        \"dids\": [],\n" +
                        "        \"pids\": [],\n" +
                        "        \"ds\": []\n" +
                        "      },\n" +
                        "      \"fields\": {\n" +
                        "        \"all_fields\": [\n" +
                        "          \"授信管理部负责人同意与否\",\n" +
                        "          \"授信管理部负责人具体意见\"\n" +
                        "        ],\n" +
                        "        \"required_fields\": [\n" +
                        "          \"授信管理部负责人同意与否\"\n" +
                        "        ]\n" +
                        "      },\n" +
                        "      \"timeoutSet\": {\n" +
                        "        \"maxTimeout\": \"0\",\n" +
                        "        \"timeout\": \"0\"\n" +
                        "      },\n" +
                        "      \"intelligence\": {}\n" +
                        "    },\n" +
                        "    \"StartEvent_1jo0h30\": {\n" +
                        "      \"condition\": [],\n" +
                        "      \"quanxian\": [\n" +
                        "        \"allowUpload\"\n" +
                        "      ],\n" +
                        "      \"permission\": {\n" +
                        "        \"rs\": [\n" +
                        "          \"基础角色\"\n" +
                        "        ],\n" +
                        "        \"qs\": [],\n" +
                        "        \"ps\": [],\n" +
                        "        \"qids\": [],\n" +
                        "        \"rids\": [\n" +
                        "          \"2000007\"\n" +
                        "        ],\n" +
                        "        \"dids\": [],\n" +
                        "        \"pids\": [],\n" +
                        "        \"ds\": []\n" +
                        "      },\n" +
                        "      \"fields\": {\n" +
                        "        \"all_fields\": [\n" +
                        "          \"流程发起人\",\n" +
                        "          \"发起人所在部门\",\n" +
                        "          \"借款人\",\n" +
                        "          \"申请事项\",\n" +
                        "          \"期限起\",\n" +
                        "          \"期限止\",\n" +
                        "          \"利率定价\",\n" +
                        "          \"贷款类型\",\n" +
                        "          \"贷款品种\",\n" +
                        "          \"当前所处环节\",\n" +
                        "          \"第一还款来源\",\n" +
                        "          \"项目/经营场所图片\",\n" +
                        "          \"第二还款来源\"\n" +
                        "        ],\n" +
                        "        \"required_fields\": []\n" +
                        "      },\n" +
                        "      \"timeoutSet\": {\n" +
                        "        \"maxTimeout\": \"\",\n" +
                        "        \"timeout\": \"\"\n" +
                        "      },\n" +
                        "      \"intelligence\": {\n" +
                        "        \"filterRule\": \"all\",\n" +
                        "        \"targetRule\": \"StartEvent_1jo0h30\",\n" +
                        "        \"chooseRule\": \"none\"\n" +
                        "      }\n" +
                        "    },\n" +
                        "    \"EndEvent_1mkd8e8\": {\n" +
                        "      \"condition\": [],\n" +
                        "      \"quanxian\": [],\n" +
                        "      \"permission\": {\n" +
                        "        \"rs\": [],\n" +
                        "        \"qs\": [],\n" +
                        "        \"ps\": [],\n" +
                        "        \"qids\": [],\n" +
                        "        \"rids\": [],\n" +
                        "        \"dids\": [],\n" +
                        "        \"pids\": [],\n" +
                        "        \"ds\": []\n" +
                        "      },\n" +
                        "      \"fields\": {\n" +
                        "        \"all_fields\": [],\n" +
                        "        \"required_fields\": []\n" +
                        "      },\n" +
                        "      \"timeoutSet\": {\n" +
                        "        \"maxTimeout\": \"0\",\n" +
                        "        \"timeout\": \"0\"\n" +
                        "      },\n" +
                        "      \"intelligence\": {}\n" +
                        "    },\n" +
                        "    \"Task_1vote14\": {\n" +
                        "      \"condition\": [],\n" +
                        "      \"quanxian\": [\n" +
                        "        \"allowBack\"\n" +
                        "      ],\n" +
                        "      \"permission\": {\n" +
                        "        \"rs\": [],\n" +
                        "        \"qs\": [\n" +
                        "          \"惠州农村商业银行-公司银行部-总行办事员\"\n" +
                        "        ],\n" +
                        "        \"ps\": [],\n" +
                        "        \"qids\": [\n" +
                        "          \"1000757\"\n" +
                        "        ],\n" +
                        "        \"rids\": [],\n" +
                        "        \"dids\": [],\n" +
                        "        \"pids\": [],\n" +
                        "        \"ds\": []\n" +
                        "      },\n" +
                        "      \"fields\": {\n" +
                        "        \"all_fields\": [\n" +
                        "          \"公司银行部调查岗同意与否\",\n" +
                        "          \"公司银行部调查岗具体意见\"\n" +
                        "        ],\n" +
                        "        \"required_fields\": [\n" +
                        "          \"公司银行部调查岗同意与否\"\n" +
                        "        ]\n" +
                        "      },\n" +
                        "      \"timeoutSet\": {\n" +
                        "        \"maxTimeout\": \"0\",\n" +
                        "        \"timeout\": \"0\"\n" +
                        "      },\n" +
                        "      \"intelligence\": {}\n" +
                        "    },\n" +
                        "    \"Task_0you61r\": {\n" +
                        "      \"condition\": [\n" +
                        "        {\n" +
                        "          \"a_attr\": {\n" +
                        "            \"href\": \"#\",\n" +
                        "            \"id\": \"1564712718371_anchor\"\n" +
                        "          },\n" +
                        "          \"data\": {},\n" +
                        "          \"li_attr\": {\n" +
                        "            \"id\": \"1564712718371\"\n" +
                        "          },\n" +
                        "          \"children\": [],\n" +
                        "          \"icon\": \"glyphicon glyphicon-file\",\n" +
                        "          \"id\": \"1564712718371\",\n" +
                        "          \"text\": \"[市场部同意与否] 等于 ‘同意’\",\n" +
                        "          \"state\": {\n" +
                        "            \"loaded\": true,\n" +
                        "            \"opened\": false,\n" +
                        "            \"disabled\": false,\n" +
                        "            \"selected\": true\n" +
                        "          },\n" +
                        "          \"type\": \"rule\"\n" +
                        "        }\n" +
                        "      ],\n" +
                        "      \"quanxian\": [\n" +
                        "        \"allowBack\"\n" +
                        "      ],\n" +
                        "      \"permission\": {\n" +
                        "        \"rs\": [\n" +
                        "          \"总行角色\"\n" +
                        "        ],\n" +
                        "        \"qs\": [],\n" +
                        "        \"ps\": [],\n" +
                        "        \"qids\": [],\n" +
                        "        \"rids\": [\n" +
                        "          \"1060026212534976512\"\n" +
                        "        ],\n" +
                        "        \"dids\": [],\n" +
                        "        \"pids\": [],\n" +
                        "        \"ds\": []\n" +
                        "      },\n" +
                        "      \"fields\": {\n" +
                        "        \"all_fields\": [\n" +
                        "          \"审查岗同意与否\",\n" +
                        "          \"审查岗具体意见\"\n" +
                        "        ],\n" +
                        "        \"required_fields\": [\n" +
                        "          \"审查岗同意与否\"\n" +
                        "        ]\n" +
                        "      },\n" +
                        "      \"timeoutSet\": {\n" +
                        "        \"maxTimeout\": \"\",\n" +
                        "        \"timeout\": \"\"\n" +
                        "      },\n" +
                        "      \"intelligence\": {\n" +
                        "        \"targetRule\": \"Task_0you61r\"\n" +
                        "      }\n" +
                        "    }\n" +
                        "  },\n" +
                        "  \"lines\": {\n" +
                        "    \"SequenceFlow_0k43wmh\": {\n" +
                        "      \"expression\": \"\",\n" +
                        "      \"conditions\": [\n" +
                        "        {\n" +
                        "          \"op\": \"等于\",\n" +
                        "          \"field\": \"市场部同意与否\",\n" +
                        "          \"value\": \"同意\"\n" +
                        "        }\n" +
                        "      ]\n" +
                        "    }\n" +
                        "  }\n" +
                        "}";
        class Permission {
            public List<String> dids;
            public List<String> rids;
            public List<String> uids;
        }

        class Node {
            public Permission permission;
        }

        class Check {
            //节点名
            String nodeName;
            //部门/岗位/人员
            String type;
            //原本应该是的名字
            String shouldName;
            //现在的名字
            String nowName;

            public Check(String nodeName, String type, String shouldName, String nowName) {
                this.nodeName = nodeName;
                this.type = type;
                this.shouldName = shouldName;
                this.nowName = nowName;
            }


        }

//        for (Integer integer : a(1, 2, 3)) {
//
//        }
//        for (Serializable f : a(1, "f")) {
//
//        }
//        for (Map<?, Object> objectMap : a(o(), new HashMap<>())) {
//
//        }
//        for (Obj obj : a().oa()) {
//
//        }
//        Arr<Obj> obj = a();
//        for (Obj obj1 : ((Arr<Obj>) a())) {
//
//        }
//        for (Object o : a().oa()) {
//
//        }
//        for (Object o : a().oa()) {
//
//        }


        Json.newInstance(this, Node.class);
        System.out.println("Local class constructors array length: " +
                Node.class.getDeclaredConstructors().length);

        Obj obj = Json.parse(json);
//        obj.o("nodes").to("fff");
        Object a = obj.o("nodes").to(new TypeReference<Map<String, Node>>() {
        });
        int d = 2;
    }


    @Test
    public void ttt(){
        String str = "{\"data\":{\"酷酷\":\"[json]{\\\"1\\\":\\\"cghb\\\"}\"},\"files\":[],\"id\":\"5d689727000b893e8bf57ddf\",\"mode\":\"deal\"}";
        Obj data = Json.parse(str);
        int d = 2;
    }


    @Test
    public void t3(){
        Arr str = aaa(a(1, 2, 3));
        Arr str22 = a(aaa(1, 2, 3));
        int d = 2;
    }


    @Test
    public void testbug1(){
        String xx = "{\"id\":\"5d74d7e8872b301a0877257b\",\"data\":{\"开始时间\":\"2019-09-10\",\"结束时间\":\"2019-09-14\",\"天数\":\"4\",\"部门领导同意与否\":\"同意\",\"部门领导具体意见\":\"你不会玩的时候叫我给你帮忙\",\"部门领导签字\":\"[img]/api/bpm/workflow/download?path=/2019-09-08/a8e1c6666dd74804ad76f78337a652a6.jpg\"}}";
        String px = "{\"id\":\"5d74d7e8872b301a0877257b\",\"data\":{\"开始时间\":\"2019-09-10\",\"结束时间\":\"2019-09-14\",\"天数\":4,\"部门领导同意与否\":\"同意\",\"部门领导具体意见\":\"你不会玩的时候叫我给你帮忙\",\"部门领导签字\":\"[img]/api/bpm/workflow/download?path=/2019-09-08/a8e1c6666dd74804ad76f78337a652a6.jpg\"}}";

        Obj obj = Json.parse(px);
        int d =2;
    }



}

