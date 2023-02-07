package com.elenappli.libX;

public class NameGetter {
    private NameGetter() {
    }

    public static String getServiceName(String id) {
        return "service-" + id;
    }
}
