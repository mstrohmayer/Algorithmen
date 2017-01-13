package com.sabel.algorithmen;

/**
 * Created by m.strohmayer on 13.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Schafgarbe Iterativ " + schafgarbeIterativ(7));
        System.out.println("Schafgarbe Rekursiv " + schafgarbeRekursiv(7));
        System.out.println("Fakultät Rekursiv " + fakultaetRecursiv(4));
        System.out.println("Fakultät Iterativ " + fakultaetIterativ(4));
        System.out.println("Potenz Rekursiv " + potenzRekursiv(2,-3));
        System.out.println("Potenz Iterativ " + potenzIterativ(2,-3));

    }

    public static int schafgarbeRekursiv(int month){

        if (month == 0 || month == 1){
            return 1;
        }

        return (schafgarbeRekursiv(month-1) + schafgarbeRekursiv(month-2));
    }

    public static int schafgarbeIterativ(int month){
        if (month == 0 || month == 1){
            return 1;
        }
        int fib = 2;
        int prefib = 1;
        int preprefib = 1;
        for (int i = 2; i <= month; i++ ){
            fib = prefib + preprefib;
            preprefib = prefib;
            prefib = fib;
        }
        return fib;
    }
    public static int fakultaetRecursiv(int n){
        if ( n == 1 ){
            return 1;
        }

        return n * fakultaetRecursiv(n-1);
    }

    public static int fakultaetIterativ(int n){
        int erg = 1;
        for (int i = 1; i <= n; i++){
            erg *= i;
        }
        return  erg;
    }

    public static double potenzRekursiv(int basis, int exponent){
        if (exponent < 0){
            return 1.0 / potenzRekursiv(basis, -exponent);
        }

        if (exponent == 0){
            return 1;
        }
        return basis * potenzRekursiv(basis, exponent-1);
    }

    public static double potenzIterativ (int basis, int exponent){
        int exp = (exponent < 0) ?  -exponent : exponent;

        if (exponent == 0){
            return 1;
        }
        double erg = 1;

        for (int i = 1; i <= exp; i++){
            erg *= basis;
        }
        if (exponent < 0){
            return 1.0 / erg;
        }
        return erg;
    }
}
