package com.company.four;

public class Cat extends Animal {
    @Override
    public void say(){
        super.say(); //оставляет ещё действие от родительского метода
        System.out.println("Meow");
    }
    public void mur(){
        System.out.println("murr");
    }
}
