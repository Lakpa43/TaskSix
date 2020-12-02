package com.Lakpa;

public class Main {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2);
        Rectangle r3 = new Rectangle(2,3);

        System.out.println(r1.getArea());
        System.out.println(r2.getArea());
        System.out.println(r3.getArea());
    }
}

class Rectangle {
    double length;
    double breadth;

    public Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    public Rectangle(double length) {
        this.length = length;
        this.breadth = length;
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea() {
        return length*breadth;
    }
}
