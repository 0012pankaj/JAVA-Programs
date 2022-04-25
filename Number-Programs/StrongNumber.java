import java.util.Scanner;

/* A number is said to be Krishnamurthy if the factorial sum of
 all its digits is equal to that number.
 Krishnamurthy number is also referred to as a Strong number. */  /*0012pankaj*/

public class StrongNumber {
    static int givfact(int r) {
        int fact = 1;
        for (int i = r; i > 0; i--) {
            fact = fact * i;
        }
        return fact;
    }

    static void checkStrong(int num) {
        int n = num, r, sum = 0;
        while (n > 0) {
            r = n % 10;
            sum = sum + givfact(r);
            n = n / 10;

        }
        if (sum == num) {
            System.out.println(num + " is  a Strong number");

        } else {

            System.out.println(num + " is Not a Strong number");
        }

    }

    public static void main(String[] args) {
        System.out.print("Enter number to check strong or not=");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkStrong(num);
    }
}

/*Enter number to check strong or not=145
145 is  a Strong number */