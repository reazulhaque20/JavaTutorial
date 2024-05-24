package org.example;

abstract class Animal {
    private int age;
    abstract void eat();

    void sleep(){
        System.out.println("Animal is sleeping...");
    }
}
