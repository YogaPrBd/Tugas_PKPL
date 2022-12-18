package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner s = new Scanner(System.in);

        System.out.println("\t++======================++");
        System.out.println("\t||\t\t\tATM\t\t\t||");
        System.out.println("\t++======================++");
        atm.LogIn();
    }
}
