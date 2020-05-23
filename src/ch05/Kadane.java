package ch05;

public class Kadane {
    public int kandaneForMaxSubArray(int[] arr) {
        int maxEndHere = 0;
        int maxSoFar = 0;
        for (int d = 0; d < arr.length; d++) {
            maxEndHere += arr[d];
            if (maxEndHere < 0) {
                maxEndHere = 0;
            }
            if (maxSoFar < maxEndHere) {
                maxSoFar = maxEndHere;
            }
        }
        return maxSoFar;
    }
    public int kandaneForMaxSubArrayForNegativ(int[] arr) {
        int maxEndHere = arr[0];
        int maxSoFar = arr[0];
        for(int d=1;d<arr.length;d++){
            maxEndHere = Math.max(arr[d], maxEndHere+arr[d]);
            maxSoFar = Math.max(maxSoFar,maxEndHere);
        }
        return maxSoFar;
    }
    public static void main(String args[]) {
        int arr[] = { 4, 7, -3, -7, 2, 8, -1, 9 };
        Kadane maxSum = new Kadane();
        System.out.println("Maksimum subarray adalah  " + maxSum.kandaneForMaxSubArray(arr));
        int arrNeg[] = { -10, -7, -3, -4, -2, -8, -3, -9 };
        System.out.println("Maksimum subarray ketika semua elemen negatif adalah : " + maxSum.kandaneForMaxSubArrayForNegativ(arrNeg));
    }
}
