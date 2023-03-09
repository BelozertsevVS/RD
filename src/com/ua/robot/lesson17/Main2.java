package com.ua.robot.lesson17;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        ArrayHolder<Integer> ah = new ArrayHolder<>();
        ArrayHolder<Double> ah2 = new ArrayHolder<>();

        ah.setArray(new Integer[]{1,2,3,4,5,6,7,8,9,10});
        ah2.setArray(new Double[]{1.0,2.3,3.5,4.9,5.1,6.1,7.2,8.3,9.5,10.1});

        Integer[] array = ah.getArray();
        Double[] array2 = ah2.getArray();

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));



    }
}
