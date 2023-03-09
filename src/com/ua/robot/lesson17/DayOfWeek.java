package com.ua.robot.lesson17;

public enum DayOfWeek {
    MONDAY(1, "MON"),
    TUESDAY(2, "TUE"),
    WEDNESDAY(3, "WED"),
    THURSDAY(4, "THU"),
    FRIDAY(5, "FRI"),
    SATURDAY(6, "SAT"),
    SUNDAY(7, "SUN");

    private int priority;
    private String shortName;

    DayOfWeek() {
    }

    DayOfWeek(int priority) {
        this.priority = priority;
    }

    DayOfWeek(int priority, String shortName) {
        this.priority = priority;
        this.shortName = shortName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
    public void printText(){
        System.out.println("I am enum");
    }
}
