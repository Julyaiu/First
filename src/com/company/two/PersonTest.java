package com.company.two;

public class PersonTest {
    public static void main(String[] args) {
        Person one = new Person();
        one.SetAge(14);
        one.SetName("Julia");
        printPerson(one);

        Person two = one;
        printPerson(two);
        changePerson(two);
        printPerson(two);

    }
    public static void printPerson(Person person){
        System.out.println(person.getAge());
        System.out.println(person.getName());
    }


    public static void changePerson(Person person){
        person.SetName(person.getName() + " Changed");
//        person.age = person.age + 100;
        person.SetAge(person.getAge() + 100);
    }


}
