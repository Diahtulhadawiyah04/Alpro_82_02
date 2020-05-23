package ch04;

public class MenampilkanAngka2Array {
	public static void main(String[] args){
		int[] num = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		
		System.out.print("Bilangan: ");
		for (int i=0; i<num.length; i++){
			String bil = num[i]+"";
			
			for(int j=0; j<bil.length(); j++){
				if (bil.charAt(j) == '2'){
					System.out.print(bil);
					System.out.print(", ");
				}
			}
		}
	}
}