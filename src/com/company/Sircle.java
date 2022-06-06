package com.company;

public class Sircle {
    private final double PI=Math.PI;

    public double getPI() {
        return PI;
    }


     static void area(int radius){
        System.out.println("Area is: " +(Math.PI * (radius * radius)));

    }
     static void circumference(int radius){
        System.out.println("Circumference is: " +(Math.PI * 2 * radius));

    }}
