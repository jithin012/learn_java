package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface I {
     void show(int i);
}


class ConsImpl implements Consumer<Integer> {
    public void accept(Integer i) {
        System.out.println(i);
    }
}
public class Main {

    public static void main(String[] args) {
        I i;
        i = n -> System.out.println(n); // used instead of anonymous class
        i.show(10000);

        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<Integer> c = new ConsImpl();
        values.forEach(c);

//        Consumer<Integer> lambda =  n -> System.out.println(n);
        values.forEach(n -> System.out.println(n));

    }
}
