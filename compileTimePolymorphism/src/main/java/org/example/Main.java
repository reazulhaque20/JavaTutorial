package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AddNumbers a1 = new AddNumbers();
        System.out.println(a1.addition(1,2));
        System.out.println(a1.addition(1,2, 3));
        System.out.println(a1.addition(3,4));
    }
}