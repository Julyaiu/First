package com.company;

public class FirstTwo {
    public static void main(String[] args) {

        recursionFucn(0);
    }
    public static void recursionFucn(int number) {
        System.out.println(number);
        System.out.println(" >^-^< ");
        if (number < 100){
            recursionFucn(number + 1);
        }

//        if (number >= 100){
//            return;
//        }
//        recursionFucn(number + 1);


    }
}

