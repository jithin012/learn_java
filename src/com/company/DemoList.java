package com.company;

import java.util.*;

public class DemoList {
    public void demo() {
        /** List : Array List */
        //ArrayList<String> li2 = new ArrayList<String>(10);
//        List li = new ArrayList();
//        li.add("Jitto");
//        li.add("Jeena");
//        li.add(1, "Jithin");
//
//        li.remove((1));
//
//        for (Object str: li.toArray()) {  // li
//            System.out.println(str);
//        }
//
//        if (!li.contains("Jithin")) { // case sensitive Eg; jeena instead of Jeena
//            System.out.println("Jithin is not present in the list");
//        }
//
//        System.out.println("This array list contains "+ li.size() + " items");
//
//        Iterator iter = li.iterator();
//        while (iter.hasNext()) {
//            System.out.println("Iterator shows "+ iter.next());
//        }

        /** List : Linked List */
//        LinkedList<Integer> linLi = new LinkedList<>();
//        linLi.add(1);
//        linLi.add(10);
//        linLi.add(2);
//        linLi.add(11);
//        linLi.addFirst(9);
//        linLi.addLast(20);
//        linLi.addLast(21);
//
//        for (Integer num: linLi){
//            System.out.println(num);
//        }
//        linLi.removeLast();
//
//        System.out.println("Size  "+ linLi.size() +" & isEmpty " + linLi.isEmpty() + " & Contains 0 "+linLi.contains(0));
        /** Vector */

        /** Stack */
        Stack<String> names = new Stack<String>();
        names.push("Baby");
        names.push("Ancy");
        names.push("Jitto");

        System.out.println("Last Item: "+names.peek());
        System.out.println("Size: "+ names.size() + " & isEmpty:  " + names.isEmpty());
        System.out.println("");
        
        Collections.sort(names);

    }
}
