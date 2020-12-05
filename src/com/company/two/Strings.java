package com.company.two;

public class Strings {
    public static void main(String[] args) {
        String string = " ";
        String string1 = " text ";
        String string2 = new String(" text2");
        System.out.println(string);
        System.out.println(string1);
        System.out.println(string2);

        string1 = string1 + " one ";
        System.out.println(" updated : " + string1);

        StringBuffer buffer = new StringBuffer("one ");
        buffer.append("white ");
        buffer.append("cat");
        System.out.println("StringBuffer append : " + buffer.toString());


    }
}
