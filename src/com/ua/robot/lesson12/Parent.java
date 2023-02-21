package com.ua.robot.lesson12;

public class Parent {
    static {
        System.out.println("Static Parent Block 1");
    }

    {
        System.out.println("Parent block 1");
    }
    public Parent() {
        System.out.println("Parent constructor");
    }
}
