package com.ua.robot.lesson14;

public class Car {
    private Engine engine;

    public Car() {
    }

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public static class Engine {
        private String name;
        private double power;
        private double voluem;

        public Engine() {
        }

        public Engine(String name, double power, double voluem) {
            this.name = name;
            this.power = power;
            this.voluem = voluem;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPower() {
            return power;
        }

        public void setPower(double power) {
            this.power = power;
        }

        public double getVoluem() {
            return voluem;
        }

        public void setVoluem(double voluem) {
            this.voluem = voluem;
        }


    }

}
