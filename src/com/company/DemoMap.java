package com.company;

import java.util.*;

public class DemoMap {
    public void demo() {
        /** hash map */
//        Map<Integer, String> map = new HashMap<>();     // unsorted order
//        map.put(1, "Jitto");
//        map.put(2, "jithin");
//        map.put(3, "Jeena");
//        map.put(null, "this is a null");
//
//        System.out.println(map.get(2));
//        System.out.println(map.get(null));
//
////        for (Integer key: map.keySet()) {
////            System.out.println(map.get(key));
////        }
//
//        map.remove(null);
//
//        for(Map.Entry<Integer, String> entry: map.entrySet()) {
//            System.out.println(entry.getKey() + " -> "+ entry.getValue());
//        }


//        Map<String, Person> personMap = new HashMap<>();  // check person @override equals and hashcode section
//        personMap.put("Jithin", new Person("Jithin", 32));
//        personMap.put("Jitto", new Person("Jitto", 28));
//        personMap.put("Jeena", new Person("Jeena", 27));
//
//        for(Map.Entry<String, Person> entry: personMap.entrySet()) {
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
//        }


        /** Linked Hash Map : doubly linked list connecting the inserted items: Make sure the ORDER of item inserted */
//        Map<String, Integer> linMap = new LinkedHashMap<>();
//        linMap.put("aaa", 1);
//        linMap.put("bbb", 2);
//        linMap.put("ccc", 3);
//        linMap.put("ddd", 4);
//        linMap.put("eee", 5);
//        linMap.put("fff", 6);
//        linMap.put("ggg", 7);
//        linMap.put("hhh", 8);
//        linMap.put("iii", 9);
//        linMap.put("jjj", 10);
//
//        for (String key: linMap.keySet()) {
//            System.out.println(key + " -> " + linMap.get(key));
//        }

        /** Tree Map : Make sure the SORTED order of the key. Default in ASC order. Running time O(logN) */
        TreeMap<Integer, String> treemap = new TreeMap<>(/*Comparator.reverseOrder()*/);
        treemap.put(10, "ten");
        treemap.put(3, "three");
        treemap.put(1, "one");
        treemap.put(8, "eight");

        for (Map.Entry<Integer, String> entry: treemap.entrySet()) {
            System.out.println(entry.getKey() +  " -> " + entry.getValue());
        }

        System.out.println("largest Key: "+ treemap.lastKey() + " Smallest "+ treemap.firstKey());
    }
}
