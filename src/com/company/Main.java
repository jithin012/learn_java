package com.company;


public class Main {

    public static void main(String[] args) {
        /*
         * Prefer compile-time-error; Problem with type casting - JVM must test type casting at run-time
         * Generics add stability to your code
         * it makes most of the bugs and error to be detectable at compile time and not at run-time
           reuse the same code with different input
         * can avoid type casting
         */

//        Generic type = new Generic();
//        type.demo();

        GenericMethod method = new GenericMethod();
        method.demo();


    }
}
