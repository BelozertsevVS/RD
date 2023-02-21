package com.ua.robot.lesson12.homeWork12;

public class PassengerCar extends Car {

    static {
        System.out.println("2) Static Passenger Car initialization block");
    }

    {
        System.out.println("6) Non Static Passenger Car initialization block 1");
    }

    {
        System.out.println("7) Non Static Passenger Car initialization block 2 ");
    }

    public PassengerCar() {
        System.out.println("8) Passenger car constructor");
    }
}
