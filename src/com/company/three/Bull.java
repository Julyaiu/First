package com.company.three;

public class Bull {

    public static final String BULL_CREATED = "Bull created";
    public static final String BULL_CREATED_WITH_NAME = "Bull created with name";
    public static int COUNT;

    String name;
    int streng;



    public  Bull(){
        System.out.println(BULL_CREATED);
//        System.out.println("Bull created");
        COUNT++;
    }

    public void setStreng(int streng){
        this.streng = streng;
    }
    public int getStreng(){
        return  streng;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public Bull(String name){
        COUNT++;
        this.name = name;
        System.out.println(BULL_CREATED_WITH_NAME);
//        System.out.println("Bull created with name");
//        -------------------------------------------
//        System.out.println("Bull's name = " + name);
    }
    public String toString(){
        return "Bull's name = " + name + ". Bull's streng = " + streng;
    }

    public Bull (String name, int streng){
        COUNT++;
        this.name = name;
        this.streng = streng;
    }

    public boolean fight(Bull bull){
        return this.streng > bull.streng;
    }





    public static int getCOUNT(){
        return COUNT;
    }
}
