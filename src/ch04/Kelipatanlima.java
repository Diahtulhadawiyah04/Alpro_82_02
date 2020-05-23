package ch04;

public class Kelipatanlima {
    public static void main(String[] args) {

        int[] n = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Menampilkan Array Kelipatan 5 Yang Elemen Sebelumnya kelipatan 5 ");
			for (int a = 0; a < n.length; a++) {
            if (n[a] % 5 == 0) {
                if (n[a - 1] % 5 == 0) {
                    System.out.print(n[a] + " ");
                }
				System.out.println();
			}
		}
	}
}
