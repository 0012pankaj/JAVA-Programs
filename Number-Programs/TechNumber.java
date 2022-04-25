/*A number is called a tech number if the given number has an 
even number of digits and the number can be divided exactly into
 two parts from the middle. After equally dividing the number,
  sum up the numbers and find the square of the
   sum. If we get the number itself as square, the given number is a 
tech number, else, not a tech number. For example, 3025 is a tech number.*/



import java.util.Scanner;

public class TechNumber {
    static void checkTech(int n) {
        int tnum = n;

        Double dc = 0.;
        while (n > 0) {
            n = n / 10;
            dc++;
        }
        if (dc % 2 == 0) {
            int x = (int) Math.pow(10, dc / 2);

            double n1 = tnum % x;
            double n2 = tnum / x;
            int n3 = (int) Math.pow(n2 + n1, 2);
            if (n3 == tnum) {
                System.out.println(n3 + " is tech number.");
            } else {
                System.out.println(tnum + " is not an tech number");
            }
        } else {
            System.out.println("Can't check no of digits are odd !");
        }

    }

    public static void main(String[] args) {
        System.out.print("Enter number to check tech or not=");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkTech(num);
    }
}


/*Enter number to check tech or not=2025
2025 is tech number.*/                     /* @pankaj0012 */
/*Enter number to check tech or not=1312
1312 is not an tech number*/