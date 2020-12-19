package com.company.four;

import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "random name";
//        System.out.println(animal.name);
//        animal.print();

        Cat cat = new Cat();
        cat.name = "Snowy";
//        System.out.println(cat.name);
//        cat.print();

        Dog dog = new Dog();
        dog.name = "Doge";
//        System.out.println(dog.name);
//        dog.print();

        Animal cat2 = new Cat();
        cat2.name = "Sunny";
//        cat2.print();
        List<Animal> animals = List.of(cat,dog,cat2,animal);

        for (Animal an: animals){
            an.print();
            an.say();
            if (an instanceof Cat){
                Cat catAnimal = (Cat) an;
                catAnimal.mur();
            }
        }


    }
}
