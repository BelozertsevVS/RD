package com.ua.robot.lesson23;

public class Money {

    private int id;
    private double sum;
    public Money(int id, double sum) {
        this.sum = sum;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Money{" +
                "id=" + id +
                ", sum=" + sum +
                '}';
    }
}
