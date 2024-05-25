package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // creating instance of Account class
        Account acc = new Account();
        // setting values through setter methods
        acc.setAcc_no(90482098491L);
        acc.setName("ABC");
        acc.setEmail("abc@gmail.com");
        acc.setAmount(100000f);
        // getting values through getter methods
        System.out.println(
                acc.getAcc_no() + " " + acc.getName() + " "
                        + acc.getEmail() + " " + acc.getAmount());
    }
}