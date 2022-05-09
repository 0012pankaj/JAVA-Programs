import java.util.Scanner;

public class Power3imp {
    /*
     * print power x^n of a number using recursion(1) (stack height=logn)
     ***************/
    public static int printpow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        // if power even-->
        if (n % 2 == 0) {
            return (printpow(x, n / 2) * printpow(x, n / 2));
        }
        // if power odd-->
        else {
            return (printpow(x, n / 2) * printpow(x, n / 2) * x);
        }
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
/* Number=2
enter power=5
32 */
/* this methord is very importan as used as recursion tree*/