package ch04;

public class jumlahkeseluruhan {
    public static void main(String[] args) {
        int[] n = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		int sum = 0, hasil = 0;
        System.out.println("Menampilkan Jumlah Keselurahan Array : ");
        for (int d = 0; d < n.length; d++) {

            hasil = sum += n[d];

        }
        System.out.println(hasil);
	}
}
