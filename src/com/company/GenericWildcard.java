package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericWildcard {
    public void showAll(List<? extends Number> list){
//        list.add(new Double(2.4));
        for (Number n: list)
            System.out.println(n);
    }

    public double sumAll(List<? extends  Number> list) {
        double sum = 0;
        for(Number n: list)
            sum += n.doubleValue();
        return sum;
    }

    public void demo() {
        List<? extends Number> l1 = new ArrayList<Integer>();

        // we use upperbound wildcard to read items
        showAll(Arrays.asList(1.2f, 2.3f));

        sumAll(Arrays.asList(1, 2, 3));
        sumAll(Arrays.asList(1.1, 2.2, 3.3));

    }
}
