package ch04;

public class ArrayL {
	public static void main(String[] args){
	
		int[] n = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		
		int hasil;
		System.out.println("Menampilkan Jumlah Angka Dengan Angka Setelahnya Yang Hasil Penjumlahannya benilai genap: ");
		for (int a = 0; a < n.length - 1; a++){
		
			hasil = n[a] - n[a+1];
			if(hasil%2==0){
			System.out.println("Angka Sebelum : " + n[a]);
			System.out.println("Angka Sesudah : " + n[a + 1]);
			System.out.println("Selisih : " + hasil);
			}
		}
	}
}
		
		
		
		
		