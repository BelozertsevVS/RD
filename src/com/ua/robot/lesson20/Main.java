package com.ua.robot.lesson20;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "one");
        map1.put(2, "two");
        map1.put(3, "three");
        map1.put(null, null);

        System.out.println(map1);
        System.out.println(map1.get(3));
        System.out.println(map1.containsKey(3));
        System.out.println();
        map1.entrySet().forEach(integerStringEntry -> {
            System.out.println(integerStringEntry);
        });

        System.out.println();

        map1.entrySet().forEach(entry -> {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });

        System.out.println();
        System.out.println(map1.keySet());
        System.out.println(map1.values());

        Map<String, List<String>> map3 = new HashMap<>();

        map3.put("Viratskyk", List.of("Vas", "Pet", "Gey"));
        map3.put("Kornelyk", List.of("Klaus", "Petter", "Garic"));

        map3.entrySet().forEach(stringListEntry -> {
            System.out.println("Teacher: " + stringListEntry.getKey());
            System.out.println("Student: " + stringListEntry.getValue());
            System.out.println();
        });


        Queue<Integer> q1 = new ArrayDeque<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);

        System.out.println(q1);
        System.out.println(q1.peek());
        System.out.println(q1);
        System.out.println(q1.poll());
        System.out.println(q1);


//        Map<List<String>, Set<Integer>> map2 = new HashMap<>();
//        map2.put(List.of("one", "two", "three"), Set.of(1,2,3));
//        System.out.println(map2);





    }
}
