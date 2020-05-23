package ch07;

public class Mergesort {
    private int[] angkaArray;

    public Mergesort(int n) {
        this.angkaArray = new int[n];
    }

    public void setangkaArray(int index, int value) {
        if (index >= 0 && index < this.angkaArray.length) {
            this.angkaArray[index] = value;
        }
    }

    public void printangkaArray() {
        String out = "angka Array = ";
        for (int a= 0; a<this.angkaArray.length; a++) {
            out += this.angkaArray[a] + ", ";
        }
        System.out.println(out);
    }

    public void Sort() {
        int a = 0;
        int j = this.angkaArray.length -1;

        Mergesort(a,j);
    }

    private void Mergesort(int start, int end) {
        int n = (end - start + 1);

        if (n > 1) {
            int mid = (start + end) / 2;

            Mergesort(start, mid);
            Mergesort(mid + 1, end);

            int[] temp = new int[n];
            int x = start;
            int y = mid + 1;

            for (int a = 0; a < n; a++) {
                if (x <= mid && y <= end) {
                    if (this.angkaArray[x] < this.angkaArray[y]) {
                        temp[a] = this.angkaArray[x];
                        x++;
                    } else {
                        temp[a] = this.angkaArray[y];
                        y++;
                    }
                } else  if (x <= mid) {
                    temp[a] = this.angkaArray[x];
                    x++;
                } else {
                    temp[a] = this.angkaArray[y];
                    y++;
                }
            }

            for (int a = 0; a < n; a++) {
                this.angkaArray[start + a] = temp[a];
            }
        }
    }

    private void ort(int start, int mid) {
    }


    public static void main(String[] args) {
        Mergesort sc  = new Mergesort(13);

        sc.setangkaArray(0, 82);
        sc.setangkaArray(1, 12);
        sc.setangkaArray(2, 41);
        sc.setangkaArray(3, 38);
        sc.setangkaArray(4, 19);
        sc.setangkaArray(5, 26);
        sc.setangkaArray(6, 9);
        sc.setangkaArray(7, 48);
        sc.setangkaArray(8, 20);
        sc.setangkaArray(9, 55);
        sc.setangkaArray(10, 8);
        sc.setangkaArray(11, 32);
        sc.setangkaArray(12, 3);

        sc.printangkaArray();
        sc.Sort();
        sc.printangkaArray();
    }
}


