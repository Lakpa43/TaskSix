package com.Lakpa;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Your initial balance is $50.");
        System.out.println("Please enter the amount you want to add");
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();

        AddAmount amt = new AddAmount(money);

        System.out.println("Your new balance is: $" + amt.amount);
    }
}

class AddAmount {
    double amount = 50.0;

    public AddAmount() {
        this.amount = 50.0;
    }

    public AddAmount(double addedAmount) {
        this.amount = 50.0;
        this.amount = addedAmount + amount;
    }
}
