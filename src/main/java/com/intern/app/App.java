package com.intern.app;

import com.google.common.collect.ImmutableMap;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.Map;

public class App {
    static Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        LOGGER.info("Hello World");
        Map<String, String> myMap = ImmutableMap.<String, String>builder()
                .put("key1", "value1")
                .put("key2", "value2")
                .put("key3", "value3")
                .put("key4", "value4")
                .put("key5", "value5")
                .put("key6", "value6")
                .put("key7", "value7")
                .put("key8", "value8")
                .put("key9", "value9")
                .build();
        for (String key : myMap.keySet()) {
            LOGGER.info(key + ", " + myMap.get(key));
        }
        myMap.forEach((k, v) -> {
            LOGGER.info(k + "-" + v);
        });

    }

}


