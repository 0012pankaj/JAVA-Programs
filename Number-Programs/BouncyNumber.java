import java.util.Scanner;

/*A positive integer that is neither in
 increasing nor decreasing number is called a bouncy number.or unshoted number
 For example, 123742, 101, 43682, etc. We observe that in the given
  number's digits are neither increasing nor decreasing if 
 we traverse from left to right, hence they are called bouncy numbers.*/ /*@pankaj0012*/

public class BouncyNumber {
    static boolean checkDecreasing(int num) {
        String str = String.valueOf(num);
        char dg;
        boolean flag = true;
        for (int i = 0; i < str.length() - 1; i++) {
            dg = str.charAt(i);
            if (dg < str.charAt(i + 1)) {
                flag = false;
            }

        }
        return flag;
    }

    static boolean checkIncreasing(int num) {
        String str = String.valueOf(num);
        char dg;
        boolean flag = true;
        for (int i = 0; i < str.length() - 1; i++) {
            dg = str.charAt(i);
            if (dg > str.charAt(i + 1)) {
                flag = false;
                break;
            }

        }
        return flag;
    }

    public static void checkBouncy(int num) {
        int n = num;
        if (checkDecreasing(num) || checkIncreasing(num) || num < 101) {
            System.out.println(num + " is not Bouncy");
        } else {
            System.out.println(num + " is Bouncy");
        }

    }

    public static void main(String[] args) {
        System.out.print("Enter number to check Bouncy or note=");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkBouncy(num);
    }

}

/*
 * Enter number to check Bouncy or note=100
 * 100 is not Bouncy
 */

/*
 * Enter number to check Bouncy or note=123742
 * 123742 is Bouncy
 */
