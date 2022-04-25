/* A positive integer whose sum of digits of its square 
is equal to the number itself is called a neon number.*/ /*@pankaj0012*/

import java.util.Scanner;

public class NeonNumber {
    static void checkNeon(int num) {
        int n = num, n1, r, sum = 0;
        n1 = n * n;
        while (n1 > 0) {
            r = n1 % 10;
            sum = sum + r;
            n1 = n1 / 10;
        }
        if (num == sum) {
            System.out.println(num + " is Neon number.");
        } else {
            System.out.println(num + " is Not Neon number.");
        }

    }

    public static void main(String[] args) {
        System.out.print("Enter number to check Neon or not=");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkNeon(num);
    }
}