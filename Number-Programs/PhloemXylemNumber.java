/*Xylem and Phloem Number
A number N will be a xylem number if the sum of its extreme 
(first and last) digits is equal to the sum of mean 
(all digits except first and last) digits. If the sum of extreme digits is not equal
 to the sum of mean digits, the number is called phloem number.*/

import java.util.Scanner;

public class PhloemXylemNumber {
    static int sumofExtremvalue(int num) {
        int n = num, sum = 0, dg = 0;
        while (n > 0) {
            n = n / 10;
            dg++;

        }
        sum = num % 10 + num / (int) (Math.pow(10, dg - 1));

        System.out.println(sum);

        return sum;
    }

    static int sumofMean(int num) {
        int n1, sum = 0;
        n1 = num / 10;
        while (n1 > 10) {
            sum = sum + n1 % 10;
            n1 = n1 / 10;

        }
        System.out.println("" + sum);
        return sum;
    }

    static void checkXylomePhloem(int num) {
        if (sumofMean(num) == sumofExtremvalue(num)) {
            System.out.println(num + " is Xylem Number");
        } else {
            System.out.println(num + " is Phloem Number");
        }

    }

    public static void main(String[] args) {
        System.out.print("Enter number to check it is Xylem or Phloem Number= ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkXylomePhloem(num);
    }
}

/* Enter number to check it is Xylem or Phloem Number= 7315
4
12
7315 is Phloem Number*/
/*Enter number to check it is Xylem or Phloem Number= 34326
9
9
34326 is Xylem Number*/