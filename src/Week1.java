public class Week1 {
    public static void PTB1(int a, int b) {
        if (a == 0) {
            if (b==0) {
                System.out.println("PT VO SO NGHIEM");
            }
            else // b != 0
                System.out.println("PT VO NGHIEM");

        }
        else // a != 0
            System.out.println("PT VO co 1 nghiem: x = " + ((float)-b/a));
    }

    public static void PTB2(int a, int b, int c){
        if (a == 0)
            PTB1(b, c);
        else {
            double d = b * b - 4 * a * c;
            if (d < 0)
                System.out.println("PT VO NGHIEM");
            else
                if (d == 0)
                    System.out.println("PT co nghiem kep x1 = x2 = " + ((float) - b/2*a));
                else{  // d > 0
                    System.out.println("Phuong trinh co 2 nghiem: ");
                    System.out.println("x1 = " + (-b-Math.sqrt(d) - b/2*a));
                    System.out.println("x2 = " + (-b+Math.sqrt(d)/2*a));
                }
        }
    }

    public static int Fact(int n) {
        int f = 1;
        for (int i = n ; i > 0; i--)
            f = f * i;
        return f;
    }

    public static int Sum(int n) {
        int s = 0;
        while(n > 0) {
            s = s + n % 10; // cong tung chu so cuoi
            n = n /10; // tinh lai phan nguyen
        }
        return s;
    }
}
