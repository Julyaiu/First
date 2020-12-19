package com.company.four;

public class Student extends Person {

    int grade;

    public Student(){
//        super();
        System.out.println("Student's empty constructor");
    }

    public Student(String name){
        super(name);
        System.out.println("Student's constructor with name");
    }

    public Student(String name, int grade){
        super(name);
        this.grade = grade;
        System.out.println("Student's constructor with name and grade");
    }

}
