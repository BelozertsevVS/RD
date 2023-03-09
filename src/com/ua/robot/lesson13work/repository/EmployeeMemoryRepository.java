package com.ua.robot.lesson13work.repository;

import com.ua.robot.lesson13work.domain.Employee;

import java.util.Random;

public class EmployeeMemoryRepository {
    public static final int SIZE = 10;

    private Employee[] employees = new Employee[SIZE];

    public EmployeeMemoryRepository() {
        fillArrayWithRandomEmployees();
    }

    public Employee[] findAll() {
        return employees;
    }

    public void save(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }

        }
    }

    public void fillArrayWithRandomEmployees() {
        for (int i = 0; i < 5; i++) {
            Employee employee = getRandomEmployee();
            employee.setId(i);
            save(employee);
        }

    }

    private static Employee getRandomEmployee() {
        Random random = new Random();
        int nameSize = random.nextInt(5, 10);
        String firstName = generateRandomNameString(nameSize);
        String lastName = generateRandomNameString(nameSize);
        int age = random.nextInt(18, 65);
        int salary = random.nextInt(300,6200);
        return new Employee(0, firstName, lastName, age, salary);

    }

    private static String generateRandomNameString(int size) {
        String alphaNumericStr = "abcdefghjkiqwertyuiopasdfghjklzxcvbnm";
        Random random = new Random();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < random.nextInt(1, 3); j++) {
                result.append(alphaNumericStr.charAt(random.nextInt(0, alphaNumericStr.length())));
            }
        }
        result.setCharAt(0, Character.toUpperCase(result.charAt(0)));
        return result.toString();
    }


}
