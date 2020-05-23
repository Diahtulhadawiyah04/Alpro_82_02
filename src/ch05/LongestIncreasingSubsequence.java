package ch05;

public class LongestIncreasingSubsequence {
    static int max_ref;
    static int _lis(int sum[], int n)
    {
        if (n == 1)
            return 1;
        int scn, max_ending_here = 1;
        for (int a = 1; a < n; a++) {
            scn = _lis(sum, a);
            if (sum[a - 1] < sum[n - 1] && scn + 1 > max_ending_here)
                max_ending_here = scn + 1;
        }
        if (max_ref < max_ending_here)
            max_ref = max_ending_here;
        return max_ending_here;
    }
    static int lis(int sum[], int n)
    {
        max_ref = 1;
        _lis(sum, n);
        return max_ref;
    }
    public static void main(String args[])
    {
        int sum[] = { 10, 11, 1, 2, 9, 8, 19, 5, 18, 17 };
        int n = sum.length;
        System.out.println("Panjangnya adalah " + lis(sum, n) + "\n");
    }
}
