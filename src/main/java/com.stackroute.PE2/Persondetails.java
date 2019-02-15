package com.stackroute.PE2;



public class Persondetails {

    private String name;
    private int age;
    private double salary;

    public Persondetails(String name,int age,double salary) {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public String details(){
        String result = "Member Name:"+this.name+"\n" +
                "Member age:"+this.age+"\n" +
                "Member salary:"+this.salary+"\n";
        return result;

    }

}
