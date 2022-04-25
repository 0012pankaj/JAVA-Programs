import java.util.Scanner;

/* Buzz number is another special number in Java that ends 
with digit 7 or divisible by 7. Unlike Prime and Armstrong numbers,
 the Buzz number is not so popular and asked by the interviewers.
In simple words, a number is said to be Buzz if it ends with 7 or is divisible by 7. */

public class BuzzNumber {
    /*@pankaj0012*/
    public static void main(String[] args) {
        System.out.print("Enter number to check BUZZ or not=");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 10 == 7 || num % 7 == 0) {
            System.out.println(num + " is a Buzz number.");
        } else {
            System.out.println(num + " is Not a Buzz number.");
        }
    }
}
