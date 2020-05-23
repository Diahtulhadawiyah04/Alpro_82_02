package ch09;

public class SieveOfEratosthenes {
    void sieveOfEratosthenes(int n) {
        boolean prime[] = new boolean[n+1];
        for(int a=0;a<n;a++)
            prime[a] = true;
        for(int m = 2; m*m <=n; m++) {
            // If prime[m] is not changed, then it is a prime
            if(prime[m] == true)
            {
                // Update all multiples of m
                for(int a = m*m; a <= n; a += m)
                    prime[a] = false;
            }
        }
        // Print all prime numbers
        for(int a = 2; a <= n; a++)
        {
            if(prime[a] == true)
                System.out.print(a + " ");
        }
    }
    // Driver Program to test above function
    public static void main(String args[])
    {
        int n = 50;
        System.out.print("Berikut ini adalah bilangan prima ");
        System.out.println("lebih kecil atau sama dengan  " + n);
        SieveOfEratosthenes g = new SieveOfEratosthenes();
        g.sieveOfEratosthenes(n);
    }
}
