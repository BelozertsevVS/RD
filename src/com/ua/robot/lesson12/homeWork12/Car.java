package com.ua.robot.lesson12.homeWork12;

public class Car {

    static {
        System.out.println("1) Static Car initialization block");
    }

    {
        System.out.println("3) Non Static Car initialization block 1");
    }

    {
        System.out.println("4) Non Static Car initialization block 2");
    }

    public Car() {
        System.out.println("5) Car constructor");
    }
}
