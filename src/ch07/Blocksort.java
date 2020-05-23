package ch07;

public class Blocksort {
    private Blocksort(int[] array) {
        int n = angkaarray.length;
        for (int j = 1;j<n;j++) {
            int key = array [j];
            int a=j-1;
            while ((a>-1)&&(angkaarray[a]>key)){
                angkaarray[a+1] = angkaarray[a];
                a--;
            }
            angkaarray[a+1]=key;
        }
    }
    private int[] angkaarray;

    public static void main(String[] args) {
        int[] angkaarray = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        //mengurutkan angkaarray menggunakan block sort

        System.out.println("Sebelum diurutkan block sort");
        for (int a:angkaarray){
            System.out.print(a+" ");
        }
        System.out.println();
        new Blocksort(angkaarray);
        //sorting angkaarray menggunakan merge sort

        System.out.println("Setelah block sort");
        for(int a:angkaarray){
            System.out.print(a+" ");
        }
    }
}
