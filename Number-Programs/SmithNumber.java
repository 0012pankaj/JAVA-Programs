/* A Smith number is a composite number whose sum of digits
 equals to the sum of digits of its prime factors,
 excluding 1. It is also known as a joke number. */  /*@pankaj0012*/

import java.util.Scanner;

public class SmithNumber {
    static int checkPrime(int i) {
        int n = i, flag = 0;
        for (int j = 2; j <= n / 2; j++) {
            if (n % j == 0) {
                flag = 1;
                break;
            } else {
                flag = 0;
            }

        }
        if (flag == 0) {
            return i;
        }

        return 0;
    }

    static int SumofPrimefactor(int num) {
        int sum = 0, pn, r2;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                pn = checkPrime(i);
                while (pn > 0) {
                    r2 = pn % 10;
                    sum += r2;
                    pn /= 10;
                }
            }
        }

        return sum;
    }

    static int SumoFdg(int n) {
        int r, sum = 0;
        while (n > 0) {
            r = n % 10;
            sum += r;
            n /= 10;

        }
        return sum;
    }

    static void checkSmith(int num) {
        int n = num;
        System.out.println("sumof Digits="+SumoFdg(n));
        System.out.println("Sum of primfactors="+SumofPrimefactor(num));
        if (SumofPrimefactor(num) == SumoFdg(n)) {
            System.out.println(num + " is Smith Number/Joker Number.");

        } else {
            System.out.println(num + " is Not Smith Number/Joker Number.");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter Number to check Smith Number or not=");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkSmith(num);
    }

}


/* Enter Number to check Smith Number or not=94
sumof Digits=13
Sum of primfactors=13
94 is Smith Number/Joker Number.*/

/* Enter Number to check Smith Number or not=166
sumof Digits=13
Sum of primfactors=13
166 is Smith Number/Joker Number.*/