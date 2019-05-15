package com.beeasy.easyshop;

import cn.hutool.core.util.StrUtil;
import com.beeasy.easyshop.ctrl.user;
import com.beeasy.easyshop.filter.Auth;
import com.beeasy.easyshop.model.RaMember;
import com.beeasy.easyshop.model.RaSeller;
import com.beeasy.web.core.Config;
import com.beeasy.web.core.DBService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static com.beeasy.easyshop.U.*;
import static com.beeasy.web.core.DBService.sqlManager;
import static com.beeasy.web.core.Flow.ValidateType.notempty;
import static com.beeasy.web.core.Flow.ValidateType.notnull;
import static com.beeasy.web.core.Flow.ValueType.md5;

public class Flow {

    @BeforeClass
    public static void before() {
        Config.init("config.json");
        DBService.start(false);
    }

    @Test
    public void testFlow(){
        var query = obj(
            "memberName", "myzy",
            "memberPasswd", "123456"
        );
        var ret = new user().login(query);
        Assert.assertEquals(200, ret.code);
        Assert.assertNotNull(ret.data);
    }
}
