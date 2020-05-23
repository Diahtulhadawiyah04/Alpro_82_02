package ch09;

import java.util.Arrays;

public class SieveOfSundaram {
    static int SieveOfSundaram(int n) {
        int nNew = (n - 3) / 3;
        boolean marked[] = new boolean[nNew + 1];
        Arrays.fill(marked, false);
        for (int a = 1; a <= nNew; a++)
            for (int b = a; (a + b + 2 * a * b) <= nNew; b++)
                marked[a + b + 2 * a * b] = true;
        //3 adalah bilangan prima
        if (n > 3)
            System.out.print(3 + " ");
        for (int a = 1; a <= nNew; a++)
            if (marked[a] == false)
                System.out.print(3 * a + 1 + " ");
        return -1;
    }
    // Driver code
    public static void main(String[] args) {
        int n = 50;
        SieveOfSundaram(n);
    }
}
