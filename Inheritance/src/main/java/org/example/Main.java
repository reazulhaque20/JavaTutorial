package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        // call methods from super class
        dog.sleep();
        dog.eat();
        // call method from sub class
        dog.bark();
        // get attribute value from super class
        System.out.println("Age : " + dog.age);
    }
}