import java.util.Scanner;

/*Strontio Number
Strontio numbers are those four digits numbers when multiplied
 by 2 give the same digit at the hundreds and tens place. Remember 
that the input number must be a four-digit number.

1386*2=2772, we observe that at tens and hundreds place digits are the same. 
Hence, 1386 is a strontio number. 1221*2=2442, digits at tens and hundreds 
place are the same. Hence, 1221 is a strontio number.*/

public class StrontioNumber {
    static void checkStrontio(int num) {
        int n = num, n1;
        n1 = n * 2;
        System.out.println(n1);
        n1 = (n1%1000)/10;    
        if (n1%10 == n1/10) {
            System.out.println(num + " is Strontio Number");
        } else {
            System.out.println(num + " is Not Strontio Number");
        }

    }

    public static void main(String[] args) {
        System.out.print("Enter only (four) number to check Strontio number or not=");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkStrontio(num);
    }

}

/* Enter only (four) number to check Strontio number or not=1221
2442
1221 is Strontio Number*/