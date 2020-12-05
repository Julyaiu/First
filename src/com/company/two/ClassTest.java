package com.company.two;

public class ClassTest {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Cat firstCat = cat;
        Cat secondCat = new Cat();

        System.out.println(cat);
        System.out.println(cat.toString());
        System.out.println(firstCat);
        System.out.println(secondCat);

    }

}
