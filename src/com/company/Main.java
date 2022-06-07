package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Write a radius please: ");
        int input=scan.nextInt();
     Sircle.area(input);
     Sircle.circumtences(input);
    }
}
