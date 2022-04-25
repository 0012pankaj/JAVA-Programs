/*A number N will be a xylem number if the sum of its extreme
 (first and last) digits is equal to the sum of mean
  (all digits except first and last) digits. If the sum of extreme
 digits is not equal to the sum of mean digits, the number is called phloem number.*/
/*@pankaj0012*/

import java.util.Scanner;

public class PhloemXylemNumber2 {
    public static void main(String[] args) {
        System.out.print("Enter Number=");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num, sumofmean = 0, sumofExtrem = 0;
        while (n != 0) {

            if (n == num || n < 10) {
                sumofExtrem += n % 10;
            } else {
                sumofmean += n % 10;
            }
            n /= 10;
        }

        System.out.println(sumofExtrem);
        System.out.println(sumofmean);
        if (sumofExtrem == sumofmean) {
            System.out.println(num + " is xylem number.");

        } else {
            System.out.println(num + " is Phloem number.");
        }

    }
}
/*Enter Number=34326                                                                                             
9                                                                                                              
9                                                   
34326 is xylem number.*/

/*Enter Number=123345
6
12
123345 is Phloem number.*/