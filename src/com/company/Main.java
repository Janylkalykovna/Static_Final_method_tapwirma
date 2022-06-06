package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a  = scanner.nextInt();
	Sircle sircle= new Sircle();
    Sircle.area(a);
    Sircle.circumference(a);
    }
}
