package ch08;

public class BoyerMooreStringSearch {
    public static void main(String[] diah ) {
        System.out.println("Test Boyer Moore String Search");
        test("Diah", "d", 0);
        test("Diah", "i", 1);
        test("Diah", "a", 2);
        test("Diah", "h", -1);
        test("movecat", "eca", 2);
        test("rataten", "at", 1);
        test("hoo", "", 0);
        test("", "arr", -1);
    }

    public static void test(String text, String word, int exp) {
        char[] textA = text.toCharArray();
        char[] wordA = word.toCharArray();
        int result = 0;
        if (result == exp)
            System.out.println("LEWAT");
        else {
            System.out.println("GAGAL");
            System.out.println("\ttext: " + text);
            System.out.println("\tword: " + word);
            System.out.println("\texp: " + exp + ", scn : " + result);
        }
    }
}