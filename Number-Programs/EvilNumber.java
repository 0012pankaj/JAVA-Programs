/* The Evil number is another special positive whole number in Java that
 has an even number of 1's in its binary equivalent. */

 /* 15 is an evil number because in its binary equivalent, i.e., 1111,
  it has an even number of ones.
16 is an odious number because in its binary equivalent, 
i.e., 10000 has not even number of ones */     /*@pankaj0012*/


import java.util.Scanner;

public class EvilNumber {
    static void checkEvil(int num) {
        int n = num, r, dc = 0;
        while (n > 0) {
            r = n % 2;
            if (r == 1) {
                dc++;
            }

            n = n / 2;
        }
        System.out.println("no of ones= " + dc);
        if (dc % 2 == 0) {
            System.out.println(num + " is Evil Number. ");
        } else {
            System.out.println(num + " is Not Evil Number. ");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number to check evil=");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkEvil(num);
    }
}

/* Enter number to check evil=15
no of ones= 4
15 is Evil Number.*/


/* Enter number to check evil=16
no of ones= 1
16 is Not Evil Number.*/