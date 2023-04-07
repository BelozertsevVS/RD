package com.ua.robot.lesson22;

import com.ua.robot.lesson19.Person;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        List<Person> persons = new ArrayList<>();
//
//        persons.add(new Person(22, "Ivan"));
//        persons.add(new Person(33, "Asefe"));
//        persons.add(new Person(45, "Bob"));
//
//
//        Collections.sort(persons, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//
//        Collections.sort(persons, (o1, o2) -> o1.getName().compareTo(o2.getName()));
//
//        Collections.sort(persons, Comparator.comparing(Person::getName));
//
//        Collections.sort(persons, (o1, o2) -> {
//            System.out.println("hello");
//            return o1.getName().compareTo(o2.getName());
//        });

        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> streamResult = list1.stream()
                .filter(integer -> integer % 2 == 0)
                .map(integer -> integer * 2)
                .collect(Collectors.toList());

        System.out.println(streamResult);

        List<Integer> list2 = List.of(11, 11, 12, 12, 15, 15, 16, 16, 20, 20);

        Set<Integer> streamResult2 = list2.stream()
                .filter(integer -> integer % 2 == 0)
                .distinct()
                .map(integer -> integer * 2)
                .collect(Collectors.toSet());


        System.out.println(streamResult2);

        List<Integer> list3 = List.of(11, 11, 12, 12, 20, 20);
        list3.stream()
                .distinct()
                .forEach(System.out::println);


    }
}
