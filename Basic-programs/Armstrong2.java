import java.util.Scanner;

public class Armstrong2 {

    static boolean armstrongFind(int num) {

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
            return true;

        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number upto which you want an armstrong number=");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        boolean ans;
        for (int i = 0; i <= limit; i++) {
            ans = armstrongFind(i);
            if (ans == true) {
                System.out.print(i + " ");
            }
        }
    }

}
