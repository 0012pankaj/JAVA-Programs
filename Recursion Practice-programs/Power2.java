import java.util.Scanner;

public class Power2 {
    public static int printpow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int n1 = printpow(x, n - 1);
        int n2 = x * n1;
        return n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number=");
        int x = sc.nextInt();
        System.out.print("enter power=");
        int n = sc.nextInt();
        int pow = printpow(x, n);
        System.out.println(pow);

    }
}
