package com.zun;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

    private Internet internet = new RealInternet();

    private static List<String> bannedSights = new ArrayList<>();

    static {
        bannedSights.add("whatever.com");
        bannedSights.add("nope.com");
        bannedSights.add("yup.com");
        bannedSights.add("hello.com");
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        if(bannedSights.contains(serverHost.toLowerCase())) throw new Exception("Access Denied");
        internet.connectTo(serverHost);
    }
}
