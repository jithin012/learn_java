package com.company;

interface I {
    default void show() {
        System.out.println("I am interface 'i'");
    }
    static void demoStatic() {
        System.out.println("Please don't call me via class instance. Since I am a static method on interface");
    }
}
interface J {
    default void show() {
        System.out.println("I am interface 'j'");
    }
}

class A {
    public void show() {
        System.out.println("I am class 'A'");
    }
}

class C extends A implements I {
    // TODO
}

class B implements I, J {
    @Override
    public void show() {
        J.super.show();
        //I.super.show();
    }
}
public class Main {

    public static void main(String[] args) {

        C c = new C();
        c.show(); // "I am class 'A'" ie; Class has more power compare to interface called "Third Rule"


        B b = new B();
        b.show(); // we must define which default wants to call by @Override

        I.demoStatic();
    }
}
