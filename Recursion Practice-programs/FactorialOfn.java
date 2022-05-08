import java.util.Scanner;

public class FactorialOfn {
    public static int printfact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        int factmo = printfact(n - 1);
        int fact = n * factmo;
        return fact;
    }

    public static void main(String[] args) {
        System.out.print("Enter number =");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int factorial = printfact(n);
        System.out.println(factorial);
    }
}
/*
 * Enter number =5
 * 120
 */