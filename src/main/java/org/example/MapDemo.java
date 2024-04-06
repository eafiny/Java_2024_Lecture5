package org.example;

import java.util.*;
import java.util.function.Predicate;

/**
 * @author Evgenia Skichko
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 100000);
        map.put("Ivan", 100000);
        System.out.println(map.put("Ivan", 500000));
        System.out.println(map);
    }
}
