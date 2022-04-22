import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Enter number to check palindrom or not=");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int tnum = num, r;
        int rev = 0;
        while (num != 0) {
            r = num % 10;
            num = num / 10;
            rev = (rev * 10) + r;
        }
        System.out.println("Reverse of a number=" + rev);
        if (tnum == rev) {
            System.out.println(tnum + " is Palindrom");
        } else {
            System.out.println(tnum + " is not Palindrom");
        }
    }
}
