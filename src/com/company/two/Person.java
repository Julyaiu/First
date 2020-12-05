package com.company.two;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    public void SetName(String name){
        this.name = name; /* если названия одинаковы */
    }
    public void SetAge(int newAge){
        age = newAge; /* если названия разные */
    }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
