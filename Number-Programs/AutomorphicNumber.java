import java.util.Scanner;

/*A number is called an automorphic number if and only if the
 square of the given number ends with the same number itself.
  For example, 25, 76 are automorphic numbers because their
square is 625 and 5776, respectively and the last two digits of 
the square represent the number itself. Some other automorphic
 numbers are 5, 6, 36, 890625, etc. */           /* @pankaj0012*/

public class AutomorphicNumber {
    static String AutomphicCheck(int n) {
        int sq = 0;
        sq = n * n;
        while (n > 0) {
            if (n % 10 != sq % 10) {
                return ("Not an Automorphic");
            }
            n = n / 10;
            sq = sq / 10;
        }

        return "Automorphic";
    }

    public static void main(String[] args) {
        System.out.print("Enter number to check Automorphic= ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(AutomphicCheck(num));
    }
}
