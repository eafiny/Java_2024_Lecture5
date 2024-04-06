package org.example.PECS_Demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgenia Skichko
 */
public class PECSDemo {
    public static void main(String[] args) {
        List<Worker> workerList = new ArrayList<>();
        List<Developer> developerList = new ArrayList<>();
        List<Backender> backenderList = new ArrayList<>();
        methodWithExtends(backenderList);
        methodWithSuper(workerList);
    }

    private static void methodWithExtends(List<? extends Developer> developerList) {
        developerList.get(0);
//        developerList.add(new Backender());

    }

    private static void methodWithSuper(List<? super Developer> developerList) {
        Developer developer = (Developer) developerList.get(0);
        developerList.add(new Backender());

    }
}
