package org.example;

import org.example.PECS_Demo.Backender;

import java.util.*;

/**
 * @author Evgenia Skichko
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(10);
//        System.out.println(hashSet);

        Set<Backender> backenders = new HashSet<>();
        backenders.add(new Backender("John", 100_000));
        backenders.add(new Backender("John", 100_000));
//        System.out.println(backenders);

        SortedSet<Backender> backendersSorted = new TreeSet<>(Comparator.comparing(Backender::getSalary));
        backendersSorted.add(new Backender("John", 100_000));
        backendersSorted.add(new Backender("David", 200_000));
        backendersSorted.add(new Backender("Ivan", 50_000));
        System.out.println(backendersSorted);

    }
}
