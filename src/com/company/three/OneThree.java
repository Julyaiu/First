package com.company.three;

public class OneThree {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.setAge(2);
        cow.setName("Smaik");
        cow.print();

        Cow cow1 = new Cow("Lucy" , 1);
//        cow1.setAge(1);
//        cow1.setName("Lucy");
        cow1.print();

        Cow cow2 = new Cow(20);
        cow2.print();

    }
}
