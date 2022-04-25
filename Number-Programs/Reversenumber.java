import java.util.Scanner;
/* @pankaj0012 */
public class Reversenumber {
    static int revNum(int n) {
        int r, rev = 0;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            rev = (rev * 10) + r;

        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.print("Enter number=");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(revNum(num));

    }
}