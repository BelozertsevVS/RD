package com.ua.robot.lesson14.homework14;

public class Teacher extends ParticipantOfTheEducationalProcess {

    private String firstName;
    private String lastName;
    private String scienceDegree;

    public Teacher() {
    }

    public Teacher(String firstName, String lastName, String scienceDegree) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.scienceDegree = scienceDegree;
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

    public String getScienceDegree() {
        return scienceDegree;
    }

    public void setScienceDegree(String scienceDegree) {
        this.scienceDegree = scienceDegree;
    }

    @Override
    public void startEducationalProcess() {
        System.out.println("To start the educational process, the teacher must: ");
        System.out.println("1) prepare a discipline program");
        System.out.println("2) familiarize with the schedule");
        System.out.println("3) get a group list in the dean's office");
        System.out.println();

    }
}
