package com.Lakpa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Student sName = new Student("Name of the Student");
        Student sName1 = new Student();

        System.out.println(sName.name);
        System.out.println(sName1.name);
    }
}

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public Student() {
        this.name = "Unknown";
    }
}

