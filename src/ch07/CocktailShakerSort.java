package ch07;

import java.util.Arrays;

public class CocktailShakerSort {
     void CocktailShakerSort(int []nilai) {
	  boolean ganti;
	  do {
		ganti = false;
		for (int d = 0; d <=  nilai.length - 2; d++) {
			if (nilai[d] > nilai[ d + 1 ]) {
				int datasort = nilai[d];
				nilai[d] = nilai[d+1];
				nilai[d+1] = datasort;
				ganti = true;
			}
		}
		if (!ganti) {
			break;
		}
		ganti = false;
		for (int d = nilai.length -2; d >= 0; d--) {
			if (nilai[d] > nilai[d+1]) {
				int datasort = nilai[d];
				nilai[d] = nilai[d+1];
				nilai[d+1]= datasort;
				ganti = true;
                            }
                    }
                    } while (ganti);
    }
        public static void main(String[] args) {
            CocktailShakerSort sc = new CocktailShakerSort();
            int nilai[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
            System.out.println("Angka Sebelum Pengurutan =");
            System.out.println(Arrays.toString(nilai));
            sc.CocktailShakerSort(nilai);
            System.out.println("Angka Sesudah Pengurutan =");
            System.out.println(Arrays.toString(nilai));
        }
    }