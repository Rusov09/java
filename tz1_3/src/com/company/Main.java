package com.company;

public class Main {

    public static void main(String[] args) {
    int x = Integer.parseInt(args[0]);
    x = factorial(x);
    System.out.println(x);
    }
    public static int factorial(int x) {
        if(x==0) {
            return 1;
        }
        return x*factorial(x-1);

    }
}
