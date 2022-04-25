import java.util.Scanner;

/*SBN is another special number in Java. ISBN stands for the 
International Standard Book Number that is carried by almost each every book.
 The ISBN is a ten-digit unique number. With the help of the ISBN, we can easily
  find any book. The ISBN number is a legal number when 1*Digit1 
  + 2*Digit2 + 3*Digit3 + 4*Digit4 + 5*Digit5 + 6*Digit6 + 7*Digit7
   + 8*Digit8 + 9*Digit9 + 10*Digit10 is divisible by 11.*/  /*@pankaj0012*/

public class ISBNnumber {
    static void checkISBN(long num) {
        long n = num, r, sum = 0, i = 1;
        while (n > 0) {
            r = n % 10;
            sum = sum + r * i;
            i++;
            n = n / 10;

        }
        System.out.println(sum + " is sum");
        if (sum % 11 == 0) {
            System.out.println(num + " is an ISBN");
        } else {
            System.out.println(num + " is Not an ISBN");
        }

    }

    public static void main(String[] args) {
        System.out.print("Enter number to check ISBN or not=");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        checkISBN(num);
    }
}


/* Enter number to check ISBN or not=8147852369
281 is sum
8147852369 is Not an ISBN */

/*Enter number to check ISBN or not= 1259060977
209 is sum
1259060977 is an ISBN*/