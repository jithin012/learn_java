package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoCollections {
    public void demo() {
        // All methods in Collections are static
        // Diff b/w Collection and Collections : Collection is an interface. Collections is a utility class in Java

        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(5);
        list.add(3);
        list.add(1);

        Collections.sort(list);
        System.out.println(list);

        System.out.println("min "+ Collections.min(list));
        System.out.println("max "+ Collections.max(list));
        System.out.println("Replace "+ Collections.replaceAll(list, 1, 10));
        System.out.println(list);

        // Unmodifiable list
        list = Collections.unmodifiableList(list); // can return un-mutable list
        //list.add(13);


    }
}
