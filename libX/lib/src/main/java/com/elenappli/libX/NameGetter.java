package com.elenappli.libX;

public class NameGetter {
    private NameGetter() {
    }

    public static String getServiceName(String id) {
        StringBuilder sb = new StringBuilder("service-");
        sb.append(id);
        return sb.toString();
    }
}
