package org.example;

public class Puppy extends Dog{
    // dynamic method dispatch happens to this method
    public void eat() {
        System.out.println("Puppy drinks milk");
    }
}
