package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author Evgenia Skichko
 */
public class ListDemo {
    public static void main(String[] args) {


        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intList.add(i);
        }
        System.out.println(intList);

//        for (Integer i : intList){
//            intList.remove(6);
//        }

        intList.removeIf(x -> x > 6);
//        System.out.println(intList);
        intList.replaceAll(x -> x * 100);
        System.out.println(intList);

        Iterator<Integer> intIterator = intList.iterator();
        while (intIterator.hasNext()) {
//            System.out.println(intIterator.next());
            if (intIterator.next() == 400) intIterator.remove();
        }
        System.out.println(intList);

        //Фабричные методы создания списков
        Integer[] intArray = new Integer[]{1, 2, 3};
        //        List<Integer> list = Arrays.asList(intArray);
//        intArray[0] = 10;
//        System.out.println(list);
//
//        List<Integer> list2 = List.of(1,2,3);
        List<Integer> list = new ArrayList<>(1000);
//        Collections.addAll(list, intArray);
        Collections.addAll(list, intArray);
        list.add(10);
        System.out.println(list);
    }
}
