package com.company.four;

public class User {
    private String firstName;
    private String surName;
    private int age;

    private int counter = 0;


    public User(String firstName, String surName, int age){
        this.firstName = firstName;
        this.surName = surName;
        this.age = age;
    }

    public String getFirstName(){
        return  firstName;
    }
    public  String getSurName(){
        return  surName;
    }
    public int getAge(){
        return age;
    }




    public void update(String firstName, String surName, int age ){
        if (!this.firstName.equals(firstName) || !this.surName.equals(surName) || this.age != age){ //alt+enter (!=)
            counter++;
            this.firstName = firstName;
            this.surName = surName;
            this.age = age;
            System.out.println("User updated");
        } else {
            System.out.println("No updated user");
        }
        System.out.println("update = " + counter);

    }


}
