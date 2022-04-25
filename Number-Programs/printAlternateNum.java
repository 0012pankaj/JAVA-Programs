/*
    /*Enter number upto which you want Alternating Prime number=40
Alternate Prime numbers are=2 5 11 17 23 31 */

import java.util.Scanner;

public class printAlternateNum {
    static boolean checkprime(int i) {
        boolean flag = true;
        int n = i;
        for (int j = 2; j < n; j++) {
            if (n != 2 && n % j == 0) {
                flag = false;
                break;
            } else {
                flag = true;

            }
        }

        return flag;

    }

    static void giveAlternateprime(int n) {
        int No = 2;
        for (int i = 2; i < n; i++) {
            if (checkprime(i)) {

                if (No % 2 == 0) {
                    System.out.print(i + " ");
                }
                No++;

            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number upto which you want Alternating Prime number=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Alternate Prime numbers are=");
        giveAlternateprime(n);

    }
}
