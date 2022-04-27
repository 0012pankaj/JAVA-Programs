import java.util.Scanner;
/* USING BITWISE (^)     @pankaj0012  */
public class SwapNumberBitwise {
    static void swapNum(int A, int B) {
        A = A ^ B;
        B = B ^ A;
        A = A ^ B;
        System.out.println("A=" + A + " B=" + B);

    }

    public static void main(String[] args) {
        System.out.print("A=");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.print("B=");
        int B = sc.nextInt();
        swapNum(A, B);
    }
}

/*
 * A=4
 * B=7
 * A=7 B=4
 */