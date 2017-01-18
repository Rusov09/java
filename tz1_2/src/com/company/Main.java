package com.company;

public class Main {

    public static void main(String[] args) {

        String x = args[0];
        String y = args[1];

        int xNumber = Integer.parseInt(x);
        int yNumber = Integer.parseInt(y);
        for (int i = 0; i < yNumber; i++) {
            xNumber = xNumber * xNumber;
        }
        System.out.println(x);
    }

    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

        }
        return true;
    }
}