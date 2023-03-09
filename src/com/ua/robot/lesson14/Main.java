package com.ua.robot.lesson14;

public class Main {
    public static void main(String[] args) {
        Figure c1 = new Circle(5);
        Figure t1 = new Triangle(2,3,5);


        printArea(c1);
        printArea(t1);

        Car car1  = new Car();
        Car.Engine engine = new Car.Engine();
        car1.setEngine(engine);


    }

    public static void printArea(Figure figure) {
        System.out.println(figure.getArea());

    }
}
