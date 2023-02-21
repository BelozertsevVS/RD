package com.ua.robot.lesson12;

public class Child extends Parent {

    static {
        System.out.println("Static Child Block 1");
    }

    {
        System.out.println("Child block 1");
    }
    public Child() {
        System.out.println("Child constructor");
    }
}
