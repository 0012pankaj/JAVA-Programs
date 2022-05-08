import java.util.Scanner;

public class MultipleofN {

    /* Multiply up to n terms */
    static void printmultiple(int i, int n, int mul) {
        if (i == n) {
            mul = mul * n;
            System.out.println(mul);
            return;
        }
        mul = mul * i;
        printmultiple(i + 1, n, mul);

    }

    public static void main(String[] args) {
        System.out.print("Enter number =");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int mul = 1;
        printmultiple(i, n, mul);
    }
}
/*Enter number =5
120 */
