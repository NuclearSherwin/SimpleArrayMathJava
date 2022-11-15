import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class ArrayEx {
    public static int[] A = new int[] {1, 2, 3, 4,5, 6, 7, 8, 9, 10}; // Khai bao A co 10 phan tu

    void Nhap(int n){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i< n; i++) {
            System.out.printf("A[%d] = ", i);
            A[i] = sc.nextInt();   // nhap so nguyen
        }

    }

    public static void In(int n) {
        for(int i = 0; i < n; i++)
            System.out.println(A[i] + " ");
    }


    void NhapNN(int n) {
        Random rd = new Random();
        for (int i = 0; i < n; i++)
            A[i] = rd.nextInt();
    }

    // tinh tong cac phan tu
    int Tong(int n) {
        int s = 0;
        for (int  i = 0; i < n; i++)
            s = s + A[i];
        return s;
    }

    // tinh tong ca so le
    int TongSoLe(int n) {
        int SumLe = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 1){
                SumLe = SumLe + A[i];
            }
        }
        return SumLe;
    }


    // tinh tbt cua so chan
    int TbtSoChan() {
        int tbChan = 0;
        int SumChan = 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0){
                SumChan = SumChan + A[i];
                count++;
            }
        }
        if (count == 0)
            return 0;
        else{
            tbChan = SumChan / count;
            return tbChan;
        }

    }

    // insert
    void Chen(int x, int y, int n) // chen x vao vi tri Y
    {
        n++; // increase N to 1
        for(int i = n - 1; i > y; i--) // pull all elements in array back 1 spot
            A[i] = A[i-1]; // place x to y posiiton
        A[y] = x;

    }

    void printAll() {
        for(int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }

    // delete element
    void deleteElement(int y, int n) { // Delete an element a position y
        for (int i = y; i < n; i++)
            A[i] = A[i + 1];
        n--;
    }

    public static void main(String[] args)
    {
        ArrayEx arr = new ArrayEx();
        int n = 5;
//        arr.NhapNN(5);
//        arr.Nhap(5);
//        System.out.println("\nTong cac phan tu: " + arr.Tong(5));
//        System.out.println("\nTong cac so le: " + arr.TongSoLe(5));
//        System.out.printf("\nTBT cac so chan: " + arr.TbtSoChan());

        // before inserting
        arr.printAll();
        arr.Chen(8, 1, n); // Insert 8 into position 1

        // after inserted
        arr.printAll();
        arr.deleteElement(1, n);
        arr.printAll();

    }

}

