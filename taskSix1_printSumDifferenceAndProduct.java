package com.Lakpa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter first real number:");
        Scanner scanner = new Scanner(System.in);
        double realNum1 = scanner.nextDouble();

        System.out.println("Please enter first imaginary number:");
        Scanner scanner1 = new Scanner(System.in);
        double imgNum1 = scanner1.nextDouble();

        System.out.println("Please enter second real number:");
        Scanner scanner2 = new Scanner(System.in);
        double realNum2 = scanner2.nextDouble();

        System.out.println("Please enter second imaginary number");
        Scanner scanner3 = new Scanner(System.in);
        double imgNum2 = scanner3.nextDouble();

        ComplexNumber c1 = new ComplexNumber(realNum1, imgNum1);
        ComplexNumber c2 = new ComplexNumber(realNum2, imgNum2);

        ComplexNumber sum = c1.sum(c2);
        ComplexNumber difference = c1.difference(c2);
        ComplexNumber product = c1.product(c2);

        System.out.println("Sum of two complex numbers: " + sum);
        System.out.println("Difference of two complex numbers: " + difference);
        System.out.println("Product of two complex numbers: " + product);
    }
}

class ComplexNumber {
    private final double realNumber;
    private final double imaginaryNumber;

    public ComplexNumber(double realNumber, double imaginaryNumber) {
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }

    public ComplexNumber sum(ComplexNumber complexNumber) {
        double real = this.realNumber + complexNumber.realNumber;
        double imaginary = this.imaginaryNumber + complexNumber.imaginaryNumber;
        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber difference(ComplexNumber complexNumber) {
        double real = this.realNumber - complexNumber.realNumber;
        double imaginary = this.imaginaryNumber - complexNumber.imaginaryNumber;
        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber product(ComplexNumber complexNumber) {
        double real = this.realNumber * complexNumber.realNumber;
        double imaginary = this.imaginaryNumber * complexNumber.imaginaryNumber;
        return new ComplexNumber(real, imaginary);
    }

    public double getRealNumber() {
        return realNumber;
    }

    public double getImaginaryNumber() {
        return imaginaryNumber;
    }

    @Override
    public String toString() {
        return " [Real number = " + realNumber +
                ", Imaginary number = " + imaginaryNumber + "i]";
    }
}
