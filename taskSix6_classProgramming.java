package com.Lakpa;

public class Main {

    public static void main(String[] args) {

        Programming p1 = new Programming();
        Programming p2 = new Programming("User String");

        System.out.println(p1.msg);
        System.out.println(p2.msg);
    }
}

class Programming {
    String msg;

    public Programming() {
        this.msg = "I love programming languages.";
        this.msg = msg;
    }

    public Programming(String msg) {
        this.msg = msg;
    }
}
