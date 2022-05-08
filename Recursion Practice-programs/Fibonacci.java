import java.util.Scanner;
/* print fibonacci series using recurisio */n
public class Fibonacci {
    public static void printfabo(int a, int b, int n) {
        if (n == 0) {
            return;

        }
        int c = a + b;
        System.out.print(c + " ");
        printfabo(b, c, n - 1);

    }

    public static void main(String[] args) {
        System.out.print("Enter number of terms=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        printfabo(a, b, n - 2);

    }

}
/* Enter number of terms=7
0 1 1 2 3 5 8 */