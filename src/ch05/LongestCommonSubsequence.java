package ch05;

public class LongestCommonSubsequence {
    int lcs( char[] C, char[] D, int m, int n )
    {
        if (m == 0 || n == 0)
            return 0;
        if (C[m-1] == D[n-1])
            return 1 + lcs(C, D, m-1, n-1);
        else
            return max(lcs(C, D, m, n-1), lcs(C, D, m-1, n));
    }
    int max(int C, int D)
    {
        return (C > D)? C : D;
    }
    public static void main(String[] args)
    {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        String L1 = "Tugas 1";
        String L2 = "Tugas 2";
        char[] C=L1.toCharArray();
        char[] D=L2.toCharArray();
        int m = C.length;
        int n = D.length;
        System.out.println("Panjangnya adalah" + " " +
                lcs.lcs( C, D, m, n ) );
    }
}
