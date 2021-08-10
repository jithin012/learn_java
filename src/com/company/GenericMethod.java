package com.company;

public class GenericMethod {
    public <T> T showItem(T item) {
        System.out.println("the item is "+ item.toString());
        return item;
    }

    public <T, V> void printItem(T t, V v) {
        System.out.println(t.toString() + " => " + v.toString());
    }

    public <T> void showItems(T[] items) {
        for (T item: items)
            System.out.print("\t "+ item);
    }

    public <T extends Comparable<T>> T boundedTypeCalculateMin(T num1, T num2) {
        if (num1.compareTo(num2) < 0)
            return num1;
        return num2;
    }

    public <T extends Number> double add(T num1, T num2) {
        double result = num1.doubleValue() + num2.doubleValue();
        return result;
    }

    public void demo() {
        String str = showItem("Jithin");
        int num = showItem(23);

        printItem("jithin", 27);
        printItem(27, "jeena");

        Integer[] nums = {1, 2, 3, 4, 5};
        String[] names = {"jitto", "Jithin", "Jeena"};
        showItems(nums);
        showItems(names);
        System.out.println(" ");

        System.out.println(boundedTypeCalculateMin(1, 2));
        System.out.println(boundedTypeCalculateMin('a', 'b'));
        System.out.println(add(10.5, 2));
    }
}
