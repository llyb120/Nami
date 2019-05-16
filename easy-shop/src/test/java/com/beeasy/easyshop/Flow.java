package com.beeasy.easyshop;

import com.beeasy.easyshop.ctrl.user;
import com.beeasy.web.core.Config;
import com.beeasy.web.core.DBService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static com.beeasy.easyshop.U.*;

public class Flow {

    @BeforeClass
    public static void before() {
        Config.init("config.json");
        DBService.start(false);
    }

    @Test
    public void testlogin(){
        var query = obj(
            "memberName", "myzy",
            "memberPasswd", "123456"
        );
        var ret = new user().login(query);
        Assert.assertEquals(200, ret.code);
        Assert.assertNotNull(ret.data);
    }


}
