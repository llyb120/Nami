package com.github.llyb120.nami;

import com.github.llyb120.nami.core.Nami;
import com.github.llyb120.nami.core.Route;
import org.junit.Test;

public class TestElse {

    @Test
    public void ttt(){
        Route.routes.add(new Route("/test/:c/:a -> com.github.llyb120.nami.test"));
        Nami.start();

    }
}
