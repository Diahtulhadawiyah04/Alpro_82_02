package ch04;

public class MenampilkanAngkaKelipatan3 {
	public static void main(String[] args) {
		int[] num = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		
		for (int i=0; i<num.length; i++){
			if (num[i] % 3 == 0){
				System.out.println(num[i]);
			}
		}
	}
}
	