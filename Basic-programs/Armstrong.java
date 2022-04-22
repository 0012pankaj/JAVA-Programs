import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.print("Enter number check armstrong or not=");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dc = 0, tnum = num, n = num, r = 0, sum = 0;
        /* DIGIT COUNT */
        while (tnum > 0) {
            tnum = tnum / 10;
            dc++;
        }
        while (n > 0) {
            r = n % 10;
            sum += Math.pow(r, dc);
            n = n / 10;

        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");

        } else {
            System.out.println(num + " is not an Armstrong number.");

        }

    }
}
