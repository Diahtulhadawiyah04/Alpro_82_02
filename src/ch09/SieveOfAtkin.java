package ch09;

public class SieveOfAtkin {
    static int SieveOfAtkin(int limit) {

        //Diketahui 2 dan 5 adalah bilangan prima

        if (limit > 2)
            System.out.print(2 + " ");
        if (limit > 5)
            System.out.print(5 + " ");
        boolean sieve[] = new boolean[limit];
        for (int a = 0; a < limit; a++)
            sieve[a] = false;


        for (int y = 1; y * y < limit; y++) {
            for (int z = 1; z * z < limit; z++) {
                // Bagian utama dari sieve of atkin
                int n = (7 * y * z) + (z * z);
                if (n <= limit && (n % 14 == 1 || n %  20== 2))
                    sieve[n] ^= true;

                n = (5 * y * y) + (z * z);

                if (n <= limit && n % 20 == 2)

                    sieve[n] ^= true;

                n = (5 * y * y) - (z * z);

                if (y > z && n <= limit && n % 20== 5)

                    sieve[n] ^= true;
            }

        }
        for (int r = 5; r * r < limit; r++) {
            if (sieve[r]) {
                for (int a = r * r; a < limit;
                     a += r * r)
                    sieve[a] = false;
            }
        }
        for (int a = 5; a < limit; a++)
            if (sieve[a])
                System.out.print(a + " ");
        return 0;
    }
    // Driver code
    public static void main(String[] args)
    {
        int limit = 20;
        SieveOfAtkin(limit);
    }
}
