package org.example;

public class Main {
    public static void main(String[] args) {
        byte varByte = 120;
        short varshort = 15300;
        int varInt = 2147483647;
        long varLong = 1844674407;
        int result = varInt + 10;

        float varFloat = 2.45f;
        double varDouble = 3.74;
        int result1 = (int) (varInt + varDouble);

        char varChar = '0';

        boolean varBoolean = true;

        System.out.println(varByte + varshort);
        System.out.println(varInt - varLong);
        System.out.println(varFloat * varDouble);
        System.out.println(varshort / varFloat);
        System.out.println(varInt % 10);

        System.out.println(varByte == varFloat);
        System.out.println(varInt > 4000);
        System.out.println(varDouble != varLong);
        System.out.println(varBoolean == false);
        System.out.println(varChar >= -10);

        System.out.println(result);
        System.out.println(result1);


    }
}