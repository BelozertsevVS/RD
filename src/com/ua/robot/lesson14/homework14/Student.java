package com.ua.robot.lesson14.homework14;

public class Student extends ParticipantOfTheEducationalProcess {
    private String firstName;
    private String lastName;
    private int course;
    private Booklet booklet;

    public Student() {
    }

    public Student(String firstName, String lastName, int course, Booklet booklet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.booklet = booklet;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Booklet getBooklet() {
        return booklet;
    }

    public void setBooklet(Booklet booklet) {
        this.booklet = booklet;
    }

    @Override
    public void startEducationalProcess() {
        System.out.println("To start the educational process, the student must: ");
        System.out.println("1) go through the briefing in the dean's office");
        System.out.println("2) Familiarize with the schedule");
        System.out.println("3) get textbooks in the library");
        System.out.println();
    }

    private static class Booklet {
        private String number;

        public String getnumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }
    }
}
