package org.example;

public class Dog extends Animal{
    // dynamic method dispatch happens to this method
    public void eat() {
        System.out.println("Dog eats meat");
    }
}
