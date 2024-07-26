package com.github.llyb120.nami;

import com.github.llyb120.nami.core.Nami;
import com.github.llyb120.nami.version.Version;
import org.junit.Assert;
import org.junit.Test;

public class TestVersion {

    @Test
    public void test(){
        int[] va = {0,0,1};
        int[] vb = {0,2};
        Assert.assertTrue(Version.gte(vb,va));
        Assert.assertTrue(Version.lte(va,vb));
        int[] va2 = {};
        int[] vb2 = {};
        Assert.assertTrue(Version.gte(va2,vb2));
    }


    @Test
    public void testAction() throws Exception {
        Nami.dev();
        Version.doIfOnVersion("test", "0.1", () -> {
            Assert.assertTrue(true);
        });
    }
}
