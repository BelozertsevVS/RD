package com.ua.robot.lesson23;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {
//        List<Integer> list = List.of(1, -2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        var mn = list.stream()
//                .anyMatch(it -> it < 0);
//
//        System.out.println(mn);
//
//        var allN = list.stream()
//                .allMatch(it -> it < 0);
//        System.out.println(allN);
//
//
//        var noneN = list.stream()
//                .noneMatch(it -> it > 90);
//        System.out.println(noneN);


//        List<String> stringList = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
//
//        String s = "xxx";
//        Optional<String> stringOptional = Optional.ofNullable(s);
//        var r = stringOptional.orElse("default");
//        System.out.println(r.length());
//
//        Optional<String> so1 = stringList.stream()
//                .filter(it -> it.length() > 3)
//                .findFirst();
//        System.out.println(so1.isPresent());
//
//        List<List<Integer>> inList = List.of(
//                List.of(1, 2, 3),
//                List.of(4, 5, 6),
//                List.of(7, 8, 9),
//                List.of(10, 11, 12)
//        );
//        System.out.println(inList);
//
//        List<Integer> result = inList.stream()
//                .flatMap(Collection::stream)
//                .collect(Collectors.toList());
//
//        System.out.println(result);
//
//        Long count = IntStream.range(0, 10)
//                .flatMap(x -> IntStream.range(0, x))
//                .peek(value -> System.out.print(value + " "))
//                .count();
//        System.out.println(count);

        List<Money> l1 = List.of(
                new Money(1, 100.3d),
                new Money(1, 200.3d),
                new Money(4, 300.3d),
                new Money(4, 400.3d),
                new Money(4, 500.3d),
                new Money(7, 600.3d),
                new Money(7, 700.3d),
                new Money(8, 800.3d),
                new Money(9, 900.3d),
                new Money(7, 1000.3d)
        );

        System.out.println(l1);

        Map<Integer, Double> l2 = l1.stream()
                .collect(Collectors.groupingBy(Money::getId, Collectors.summingDouble(Money::getSum)));
        System.out.println(l2);

        


    }
}
