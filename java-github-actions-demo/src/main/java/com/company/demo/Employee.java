package com.company.demo;

public class Employee {

    private int id;

    private String name;

    private String role;

    private String team;

    public Employee(int id,
                    String name,
                    String role,
                    String team){

        this.id=id;
        this.name=name;
        this.role=role;
        this.team=team;

    }

    public void display(){

        System.out.println("----------Employee Details-----------");

        System.out.println("Employee ID : "+id);

        System.out.println("Employee Name : "+name);

        System.out.println("Employee Role : "+role);

        System.out.println("Employee Team : "+team);

        System.out.println("-------------------------------------");

    }

}