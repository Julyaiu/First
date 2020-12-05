package com.company.two;

public class CompareTest {
    public static void main(String[] args) {
        int one = 1;
        int two = 1;
        if (one == two){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        String first = "one";
        String second = "one";

        if (first.equals(second)){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        Person person = new Person();
        person.SetName("Dasha");
        Person person1 = new Person();
        person1.SetName("Ruslan");
        if (person.equals(person1)){
            System.out.println("Persons are equal");
        } else {
            System.out.println("Persons aren't equal");
        }

    }
}
