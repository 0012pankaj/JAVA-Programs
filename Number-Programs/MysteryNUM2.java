import java.util.Scanner;

import javax.sound.midi.Soundbank;

/*Example 1: Find the mystery number between 81 and 95 
that contains 0 at the unit place. /*@pankaj0012*/
public class MysteryNUM2 {
    static void checkMystery(int num) {

        int n = num, flag = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (11 * (i + j) == n) {
                    if (n == (i * 10 + j) + (j * 10 + i)) {
                        System.out.println((i * 10 + j) + " " + (j * 10 + i));
                        System.out.print(num + " ");
                        System.exit(0);

                    }

                }

            }
        }

    }

    public static void main(String[] args) {
        System.out.print("Enter number range upto which you want  Mystery number =");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            checkMystery(i);
        }

    }
}
