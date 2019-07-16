package com.github.llyb120.nami;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;
import org.junit.Test;

import java.io.*;
import java.util.HashMap;

import static com.github.llyb120.nami.json.Json.o;

public class TestMust {

    @Test
    public void tets() throws IOException {

        var stime = System.currentTimeMillis();
        HashMap<String, Object> scopes = new HashMap<String, Object>();
        scopes.put("name", "Mustache");
        scopes.put("feature", o("description", "rilegou"));

        Writer writer = new StringWriter();
        MustacheFactory mf = new DefaultMustacheFactory();
        Mustache mustache = mf.compile(new StringReader("{{name}}, {{feature.description}}!"), "example");
        System.out.println(System.currentTimeMillis() - stime);
        stime = System.currentTimeMillis();
        mustache.execute(writer, scopes);
//        writer.flush();

        System.out.println(System.currentTimeMillis() - stime);

    }
}
