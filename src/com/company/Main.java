package com.company;

public class Main {

    public static void main(String[] args) {
        double x = 7;
        int n = 3;
        System.out.println(x + " ^ " + n + " = " + nPow(x,n));
        //Фибоначчи
        for (int i=0;i<7;i++){
            System.out.println("Fibonachi(" + i + ")=" + nFib(i));
        }

    }
    // целая степень числа
    static double nPow(double x, int n){
        if (n == 0)
            return 1;
        if (n < 0)
            return 1 / nPow(x, -n);
        else
            return x * nPow(x, n-1);
    }
    // числа Фибоначчи
    static long nFib (int n){
        if (n == 0 || n == 1)
            return 1;
        return nFib(n-1) + nFib(n-2);
    }

}
