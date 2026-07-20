package com.company.demo;

import java.time.LocalDateTime;

public class VersionInfo {

    public static void printVersion(){

        System.out.println("Application Version : 1.0.0");

        System.out.println("Java Version : "
                + System.getProperty("java.version"));

        System.out.println("OS : "
                + System.getProperty("os.name"));

        System.out.println("Current Time : "
                + LocalDateTime.now());

    }

}