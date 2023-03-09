package com.ua.robot.lesson17;

public class Main {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek.getPriority());
        System.out.println(DayOfWeek.TUESDAY);
        System.out.println(DayOfWeek.WEDNESDAY.name());
        System.out.println(DayOfWeek.valueOf("MONDAY"));

        System.out.println();

        for (DayOfWeek value : DayOfWeek.values()) {
            System.out.println(value);
        }

        System.out.println();
        for (DayOfWeek value : DayOfWeek.values()) {
            System.out.println(value + " " + value.ordinal());

        }

        dayOfWeek.printText();
        System.out.println(dayOfWeek == DayOfWeek.FRIDAY);

        Person p1 = new Person("Ivan", Sex.MAIL);
        Person p2 = new Person("Maria", Sex.FEMALE);

        System.out.println(p1);

        int a = 6;
        Integer b = 6;
        int aa = Integer.parseInt("7");

        System.out.println(aa);


    }
}
