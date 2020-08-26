package com.revature;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Optional;

public class App {
    public static final Optional<String> port = Optional.ofNullable(System.getenv("PORT"));

    public static void main(String[] args) throws Exception {
        // String contextPath = "/monitor";
        // String appBase = ".";
        // Tomcat tomcat = new Tomcat();
        // tomcat.getConnector();
        // tomcat.setPort(Integer.valueOf(port.orElse("8080")));
        // tomcat.getHost().setAppBase(appBase);
        // tomcat.addWebapp(contextPath, appBase);
        // tomcat.start();
        // tomcat.getServer().await();

    }
}
