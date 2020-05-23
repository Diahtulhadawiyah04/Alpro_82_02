package ch08;

import java.io.*;
import java.math.*;

public class MillerRabin {
    static int power(int x, int y, int m) {
        int scn = 1; // Initialize result

        //Update x if it is more than or
        // equal to m
        x = x % m;
        while (y > 0) {
            if ((y & 1) == 1)
                scn = (scn * x) % m;
            y = y >> 1;
            x = (x * x) % m;
        }
        return scn;
    }
    static boolean miillerTest(int d, int n) {
        int a = 2 + (int)(Math.random() % (n - 4));
        int x = power(a, d, n);
        if (x == 1 || x == n - 1)
            return true;
        while (d != n - 1) {
            x = (x * x) % n;
            d *= 2;
            if (x == 1)
                return false;
            if (x == n - 1)
                return true;
        }
        return false;
    }
    static boolean isPrime(int n, int k) {
        if (n <= 1 || n == 4)
            return false;
        if (n <= 3)
            return true;
        int d = n - 1;
        while (d % 2 == 0)
            d /= 2;
        for (int i = 0; i < k; i++)
            if (!miillerTest(d, n))
                return false;
        return true;
    }
    public static void main(String args[]) {
        int k = 4;
        System.out.println("Semua bilangan prima " + "lebih kecil dari 100: ");
        for (int n = 1; n < 100; n++)
            if (isPrime(n, k))
                System.out.print(n + " ");
    } }
