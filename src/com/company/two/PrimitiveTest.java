package com.company.two;

public class PrimitiveTest {
    public static void main(String[] args) {
        int age = 14;
        System.out.println("Age before = " + age);
        ChangeAge(age);
        System.out.println("Age after x2 = " + age);

    }

    public static void ChangeAge(int age){
        age += 136;
        System.out.println("Age After = " + age);
    }
}
