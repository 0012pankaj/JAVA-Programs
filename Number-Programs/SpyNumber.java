/* positive integer is called a spy number if the sum     
and product of its digits are equal. In other words, 
a number whose sum and product of all digits are equal is called a spy number. */
/* @pankaj0012*/

import java.util.Scanner;

public class SpyNumber {
    static void checkSpy(int num) {
        int tnum=num,r, sum = 0, multiple = 1;
        while (num > 0) {
            r = num % 10;
            sum += r;
            multiple *= r;
            num=num/10;
        }
        if (multiple == sum) {
            System.out.println(tnum + " is Spy number.");
        } else {
            System.out.println(tnum + " is Not Spy number.");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number to check Neon or not=");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkSpy(num);
    }
}



/* Enter number to check Neon or not=123
123 is Spy number.*/
/*Enter number to check Neon or not=1234
1234 is Not Spy number.*/