package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //        Scanner scanner = new Scanner(System.in);
        //        int n = scanner.nextInt();


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int[] ints = new int[n];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
            System.out.print(ints[i] + " ");
        }
        System.out.println();
        System.out.println("Четные числа : ");
        for (int i = 0; i < ints.length; i = i + 2) {
            System.out.print(ints[i] + " ");
        }

        System.out.println();
        System.out.println("Нечетные числа : ");
        for (int i = 1; i < ints.length; i = i + 2) {
            System.out.print(ints[i] + " ");
        }









        System.out.println();
        System.out.println("---------------");
        for (int a = 0; a < ints.length; a++) {
            ints[a] = a;
            if (ints[a] % 2 == 0){
                System.out.println("Четные числа : ");
                System.out.println(ints[a] + " ");
            } else {
                System.out.println("Нечетные числа : ");
                System.out.println(ints[a] + " ");
            }

        }


    }
}
