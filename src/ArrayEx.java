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
    int TongSoLe() {
        int SumLe = 0;
        for (int i = 0; i < A.length; i++) {
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
        tbChan = SumChan / count;

        return tbChan;
    }


    public static void main(String[] args)
    {
        ArrayEx arr = new ArrayEx();
//        arr.NhapNN(5);
//        arr.Nhap(5);
//        System.out.println("\nTong cac phan tu: " + arr.Tong(5));
//        System.out.println("\nTong cac so le: " + arr.TongSoLe());
        System.out.println("\nTBT cac so chan: " + arr.TbtSoChan());
    }

}

