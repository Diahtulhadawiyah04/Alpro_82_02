package ch04;

public class ArrayM {
	public static void main(String[] args){
	
		int[] n = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		int hasil,hasil_selisih;
		
		hasil_selisih = 0;
		System.out.println("Menampilkan Angka - Angka Selisih pada poin i : ");
		for (int a = 0; a < n.length - 1; a++){
			if (n.length - 1 < n.length){
				hasil = n[a +1] - n[a];
				hasil_selisih = hasil_selisih + hasil;
			}	
			 //Tampilkan indeks dan selisih
			 //System.out.println("Angka Sebelum : " + n[a]);
			 //System.out.println("Angka Sesudah : " + n[a + 1);
			//System.out.println("Jumlah Selisih : " + hasil);
			//System.out.println("Array Out Of Index");
		}
			//hasil akhir
			
			System.out.println("Jumlah Selisih : " + hasil_selisih);
	}
}
			
		
	

		