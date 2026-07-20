package com.company.demo;

public class Application {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("GitHub Actions Java CI Demo");
        System.out.println("======================================");

        GreetingService service = new GreetingService();

        service.printGreeting();

        VersionInfo.printVersion();

        Employee emp = new Employee(
                101,
                "Hari",
                "DevOps Engineer",
                "Platform Team");

        emp.display();

        System.out.println("Application executed successfully.");

        System.out.println("======================================");

    }

}