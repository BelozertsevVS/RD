package com.ua.robot.lesson17;

public class ArrayHolder<T> {
    private T[] array;

    public ArrayHolder() {
    }

    public ArrayHolder(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }
}
