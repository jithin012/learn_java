package com.company;

class Store<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

class HashTable<K, V> {
    private K key;
    private V value;

    public HashTable(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

public class Generic {
    public void demo() {
        Store item = new Store();
        item.setItem(34);
//        input a = (Integer) item.getItem();
//        System.out.println("Type casting a : " + a);
        System.out.println(item.getItem());

        // eg: 2
        Store item1 = new Store();
        item1.setItem("Jithin");
        System.out.println(item1.getItem());

        // eg: 3
        HashTable<String, Integer> hash = new HashTable<>("Hello", 27);
        System.out.println(hash);

        // eg: 4
        HashTable<Integer, String> hash1 = new HashTable<>(27, "Hello");
        System.out.println(hash1);
    }
}
