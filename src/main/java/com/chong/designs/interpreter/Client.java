package com.chong.designs.interpreter;

public class Client {

    public static void main(String[] args) {
        System.out.println(Expression.create("2 + 3 * 4 - 5 / 3").interpret());
        System.out.println(Expression.create("5 * 2 + 9 - 1 / 6").interpret());
        System.out.println(Expression.create("5 / 5 + 1 / 1 * 10 - 1").interpret());
    }
}
