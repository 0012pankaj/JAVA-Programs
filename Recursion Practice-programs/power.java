import java.util.Scanner;

public class power {
    public static void printpow(int x, int n, int pow) {
        if (n == 0) {
            System.out.println(pow);
            return;

        }

        pow = pow * x;
        printpow(x, n - 1, pow);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number=");
        int x = sc.nextInt();
        System.out.print("enter power=");
        int n = sc.nextInt();
        int pow = 1;
        printpow(x, n, pow);
    }
}
/* Number=9
enter power=2
81*/
