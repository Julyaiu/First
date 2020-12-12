package com.company.three;

public class BullTest {
    public static void main(String[] args) {
        Bull bull = new Bull("Jehy");
        System.out.println(bull);

        Bull[] bulls = new Bull[20];
        for (int i = 0; i < bulls.length; i++){
//            Bull bull1 = new Bull();
            bulls[i] = new Bull();
        }

        bull.getName();
        // к классу-только статические
        // к объекту лучше не статические
        Bull.getCOUNT();
        System.out.println("Bull count = " + Bull.getCOUNT());

        Bull bullFirst = new Bull("Genty", 45);
        Bull bullSecond = new Bull("Paimon", 67);
        System.out.println("Does Genty win? " + bullFirst.fight(bullSecond));
        System.out.println("Does Paimon win? " + bullSecond.fight(bullFirst));

    }
}
