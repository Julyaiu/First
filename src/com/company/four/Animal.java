package com.company.four;

public class Animal { //abstract -нельзя создавать Animal. только Cat,Dog...
    String name;

    public void print(){
        System.out.println("Class' name = " + this.getClass().getSimpleName());
        System.out.println("Animal's name = " + this.name);
    }

    public void say(){
        System.out.println("Animal says");
    }

}
