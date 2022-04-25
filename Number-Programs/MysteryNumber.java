/* Mystery Number Example:-11 ( 9+3) = 132 = 93+39

11 (6 + 8) = 154 = 68 + 86

11 (7+9 ) = 176 = 79 + 97
*/


import java.util.Scanner;

import javax.imageio.plugins.tiff.ExifTIFFTagSet;

public class MysteryNumber {
    static void checkMystery(int num) {
        int n = num, flag = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (11 * (i + j) == n) {
                    if (n == (i * 10 + j) + (j * 10 + i)) {
                        System.out.println((i * 10 + j)+" "+(j * 10 + i));
                        System.out.println(num + " is Mystery Number.");
                        System.exit(0);
                    } else {
                        flag = 0;
                        break;
                    }
                } else {
                    flag = 0;
                }

            }
        }
        if (flag == 0) {
            System.out.println(num + " is Not Mystery Number.");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number to check it is Mystery number or not=");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkMystery(num);

    }

}