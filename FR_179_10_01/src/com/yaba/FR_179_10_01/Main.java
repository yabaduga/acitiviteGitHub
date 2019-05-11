package com.yaba.FR_179_10_01;

public class Main {

    public static void main(String[] args) {

        //  int i = 34/0; // pas d'exception à la compilation mais ArithmeticException à l'exécution
        try {
            int i = 34 / 0;
        }
        catch (ArithmeticException exp) {
            System.out.println("ceci n'arrétera pas l'exécution en passant l'exception 'sous silence' ");
        }
    }
}