package ch04;

public class selisih_genap {
	public static void main(String[] args){
		int[] n = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

		int hasil;
        System.out.println("Menampilkan Selisih Angka - Angka dengan Angka Genap dengan Angka Setelahnya Yang Genap: ");
        for (int a = 0; a < n.length - 1; a++) {

            if (n[a] % 2 == 0) {
                if (n[a + 1] % 2 == 0) {
                    hasil = n[a + 1] - n[a];
                    System.out.println("Angka Sebelum : " + n[a]);
                    System.out.println("Angka Sesudah : " + n[a + 1]);
                    System.out.println("Selisih : " + hasil);
                    //break;
                }
			}
		}
	}
}