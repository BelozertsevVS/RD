package com.ua.robot.lesson25;


public class Main {
    public static void main(String[] args) throws Exception {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Start");
        try {
            System.out.println(array[1] / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally");
        }

        System.out.println("End1");

        try {
            System.out.println(array[1] / 0);

        } catch (ArithmeticException e) {
            // System.exit(0);
        } finally {
            System.out.println("Finally");
        }

        try {
            myWork(-2);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }



        System.out.println("End2");

       // int test(int i){
//            int result = 0;
//            try {
//                result = i / 0;
//            } catch (ArithmeticException e) {
//                throw new ArithmeticException();
//            }
//            return result;
//        }

//        private static void delay() throws InterruptedIOException {
//            Thread.sleep(1000);
//        }


//        for (int i = 0; i < 20; i++) {
//            System.out.println(i + 1);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//
//            }

//        private static void myWork(int i) throws MyException  {
//            if (i < 0) {
//                throw new MyException();
//            }
//            System.out.println(i);
//        }




    }
    private static void myWork(Integer i) throws NegativeNumberException {
        if (i < 0) {
            throw new NegativeNumberException("Number can't be negative");
        }
        System.out.println(i);
    }

}

