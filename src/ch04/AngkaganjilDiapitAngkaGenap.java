package ch04;

public class AngkaganjilDiapitAngkaGenap {
	public static void main(String[] args){
	
		int[] bil = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		
		System.out.println("");
		System.out.print("Bilangan Ganjil Yang Diapit Bilangan Genap: ");
		for(int i = 0; i < bil.length; i++){
			if(bil [i] % 2!= 0){
				System.out.print(bil[i] + " ");
			}
		}
		System.out.println("");
	}
}