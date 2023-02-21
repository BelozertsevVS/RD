package com.ua.robot.lesson12;

public class Car {
    public static String type = "Car";
    private int speed;

    public Car() {
    }

    public Car(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                '}';
    }

    public static void ride(){

        System.out.println("Wrum - wrum");
    }

    public void run(int speed){
        System.out.println("qqqqqqqqq");

    }
}


