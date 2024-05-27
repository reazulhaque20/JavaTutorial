package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // create reference variables
        Animal a1, a2, a3;
        System.out.println("-----No Dynamic method dispatch-----");
        a1 = new Animal();
        a1.eat();
        System.out.println("-----Dynamic method dispatch-----");
        a2 = new Dog();
        a3 = new Puppy();

        a2.eat();
        a3.eat();
    }
}