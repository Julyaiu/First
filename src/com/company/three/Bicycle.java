package com.company.three;

public class Bicycle {
    int height;
    String model;

    public Bicycle(int weight, String model){
        this.model = model;
        this.height = weight;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "height=" + height +
                ", model='" + model + '\'' +
                '}';
    }

    public void ride(){
        System.out.println("Ridee..");
    }

    public class SteeringWheel{
        public void left(){
            System.out.println("left");
        }
        public void right(){
            System.out.println("right");
        }
    }

    public class Seat{
        public void up(){
            height = height + 3;
            System.out.println("up");
        }
        public void down(){
            height = height - 3;
            System.out.println("down");
        }
    }





}
