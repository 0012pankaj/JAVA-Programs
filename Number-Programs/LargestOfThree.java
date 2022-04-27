import java.util.Scanner;
/* pankaj0012 */
public class LargestOfThree {
    static void checkLargest(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                System.out.println(a + " is largest.");
            } else {
                System.out.println(c + " is largest.");
            }
        } else {
            if (b > c) {
                System.out.println(b + " is largest.");
            } else {
                System.out.println(c + " is largest.");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter three numbers to compare=");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number.a=");
        int a = sc.nextInt();
        System.out.print("Enter number.b=");
        int b = sc.nextInt();
        System.out.print("Enter number.c=");
        int c = sc.nextInt();
        checkLargest(a, b, c);
    }
}
