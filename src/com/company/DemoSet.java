package com.company;

import java.util.*;

public class DemoSet {
    public void demo() {
        /** HashSet: initial capacity 16. No duplicate No order */
        // hashcode transform the input into an array index
//        Set<String> set = new HashSet<>();
//
//        set.add("Jitto");
//        set.add("Jithin");
//        set.add("Jeena");
//
//        for (String s: set) {
//            System.out.println(s);
//        }
//        System.out.println("getting an element at index 2 "+ set.toArray(new String[set.size()])[2]);

        /** LinkedHashSet: maintain the insertion order. MORE MEMORY. Connected items */

//        Set<String> nameSet = new LinkedHashSet<>();
//        nameSet.add("adm");
//        nameSet.add("kevin");
//        nameSet.add("joe");
//        nameSet.add("ana");
//        for (String s: nameSet) {
//            System.out.println(s);
//        }

        /** Treeset: Red-Black tree(Balanced tree).  O(logN) . MEMORY FRIENDLY */
        //Set<Integer> set = new TreeSet<>();
        SortedSet<Integer> set = new TreeSet<>(/* Comparator.reverseOrder */);
        set.add(10);
        set.add(9);
        set.add(8);
        set.add(7);
        set.add(6);
        set.add(5);
        set.add(4);
        set.add(3);

        for (Integer s: set) {
            System.out.println(s);
        }

         Set<Integer> subSet = set.subSet(1, 5);  // tailSet, headSet, first, last,
        System.out.println("subset  "+subSet);
    }
}
