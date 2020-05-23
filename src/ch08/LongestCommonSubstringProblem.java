package ch08;

public class LongestCommonSubstringProblem {
    static String Y, Z;
    // Returns length of function for longest common
    // substring of Y[0..m-1] and Z[0..n-1]
    static int lcs(int a, int b, int count) {

        if (a == 0 || b == 0) {
            return count;
        }
        if (Y.charAt(a - 1) == Z.charAt(b - 1)) {
            count = lcs(a - 1, b - 1, count + 1);
        }
        count = Math.max(count, Math.max(lcs(a, b - 1, 0), lcs(a - 1, b, 0)));
        return count;
    }
    // Driver code
    public static void main(String[] args){
        int n, m;
        Y = "DIAHTUL";
        Z = "HADAWIYAH";

        n = Y.length();
        m = Z.length();
        System.out.println(lcs(n, m, 0));
    }
}
