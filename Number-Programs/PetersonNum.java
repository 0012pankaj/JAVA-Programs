import java.util.Scanner;

/*A number is said to be Peterson if the sum of factorials of each digit is 
equal to the sum of the number itself.*/ /*pankaj0012*/

public class PetersonNum {
    static void checkPeterson(int n) {
        int tnum = n;
        int r = 0, sum = 0;
        while (n > 0) {
            r = n % 10;
            int fact = 1;
            for (int i = r; i > 0; i--) {
                fact = fact * i;
            }
            sum = sum + fact;
            n = n / 10;
        }
        if (sum == tnum) {
            System.out.println(tnum + " is Peterson number.");
        } else {
            System.out.println(tnum + " is not  Peterson number.");
        }

    }

    public static void main(String[] args) {
        System.out.print("Enter number to check Peterson or not=");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkPeterson(num);
    }

}
