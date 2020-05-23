package ch03;

import java.util.Scanner;

public class MenentukanBilanganPembagiTerkecilSelain1dan2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan pembagi terkecil :");
        int bil = input.nextInt();

        if (bil > 0 && bil <= 4 ) {
            System.out.println("Bilangan Pembagi terkecil dari " + bil + "adalah" + bil);
        }else{
            for (int a = 3; a <= bil; a++){
                if (bil %a == 0){
                    System.out.println(" Bilangan Pembagi terkecil dari  " + bil + " adalah" + bil);
                            break;
                }
            }
        }
        }



    }

