package ch04;

public class ArrayK {
	public static void main(String[] args){
		int[] n = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Menampilkan Angka - Angka Yang Setelahnya Bernilai Lebih Besar: ");

        for (int a = 0; a < n.length - 1; a++) {

            if (n[a + 1] > n[a]) {
                System.out.print(n[a] + " ");

            }

        }
        System.out.println();
    }
}
