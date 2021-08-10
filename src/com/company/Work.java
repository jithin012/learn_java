package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Design a class that acts as a cache for the following feature(s):
 *
 * whenever the user searches for a web address (www.google.com or www.facebook.com) first we have to check whether it is present in the cache or not
 *
 * of course we have to track recently visited websites as well
 *
 * for example we use a data structure with capacity 5 - it means we track 5 websites exclusively
 *
 * the recently visited websites are stored in some part of the data structure - it depends on what concrete class you use :)
 *
 * provide one version of the class that uses generics. Again you are allowed to use any built-in data structures to store and retrieve the data (for example for the cache).
 */
class Pair {
    private String url;
    private String data;

    public Pair(String url, String data) {
        this.url = url;
        this.data = data;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Pair "+ url + " " + data;
    }
}

class Cache {
    private List<Pair> cache;
    // store up to 5 items in the cache
    private static final int CAPACITY = 5;

    public Cache() {
        this.cache = new ArrayList<>();
    }

    public void search(String url) {
        Pair searchItem = null;

        // check if the given url is already searched for
        for(Pair pair: cache) {
            if (pair.getUrl().equals(url)) {
                searchItem = pair;
            }
        }

        if (searchItem != null) {
            // update the cache: put item to the begining
            cache.remove(searchItem);
            cache.add(0, searchItem);
        } else {
            // url is not present in the cache
            Pair pair = new Pair(url, "sample data for the url");

            // check capacity
            if(cache.size() >= CAPACITY) {
                cache.remove(CAPACITY -1);
            }

            // check for empty
            if(cache.isEmpty()) {
                cache.add(pair);
            } else {
                // if array is empty, then we are not able to insert with index 0
                cache.add(0, pair);
            }
        }
    }
    public void showCache() {
        for(Pair item: cache) {
            System.out.println(item);
        }
    }
}
public class Work {
    public void demo() {
        Cache cache = new Cache();
        cache.search("Google.com");
        cache.search("apple.com");
        cache.search("cnn.com");
        cache.search("bbc.com");
        cache.search("fb.com");
        cache.search("amazon.com");
        cache.search("Google.com");
        cache.search("fb.com");
        cache.search("mc-lab.com");

        cache.showCache();
    }
}
