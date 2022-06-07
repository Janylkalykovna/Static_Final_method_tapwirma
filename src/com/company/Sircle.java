package com.company;

public class Sircle {
    private final double PI=Math.PI;

    public Sircle() {
    }

    public double getPI() {
        return PI;
    }

    static void area(int radius){
        System.out.println("Sircle area is: "+(radius+radius+Math.PI));
    }
    static void circumtences(int radius){
        System.out.println("Sircle's curcumtences is: "+2*(radius*radius));
    }
}
