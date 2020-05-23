package ch04;

public class ArrayN {
	public static void main(String[] args){
	
		int[] n = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		int sum = 0, hasil;
		System.out.println("Menampilkan Jumlah Angka - Angka Di Dalam Array Dengan Angka - Angka Sebelumnya : ");
		for (int a = 0; a < n.length-1; a++){
			
			hasil = sum += n[a];
			
			System.out.println(hasil + " " + n[a] + " ");
			System.out.println(n[a + 1] + " ");
		}
		System.out.println();
	}
}