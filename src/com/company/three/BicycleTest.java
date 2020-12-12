package com.company.three;

public class BicycleTest {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(70, "One");

        Bicycle.Seat seat = bicycle.new Seat();
        Bicycle.SteeringWheel steeringWheel = bicycle.new SteeringWheel();
        steeringWheel.left();
        steeringWheel.right();

        seat.up();
        seat.up();
        seat.up();
        seat.up();
        seat.up();

        seat.down();
        seat.down();

        System.out.println(bicycle);
    }
}
