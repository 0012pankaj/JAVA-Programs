/*Java Program to print Odd and Even Numbers from an Array*/

import java.util.Scanner;

public class OddAndEvenPrint {
    static void giveOddEven(int arry[], int size) {
        int even[] = new int[size], k = 0;
        int Odd[] = new int[size], l = 0;
        for (int i = 0; i < size; i++) {
            if (arry[i] % 2 == 0) {
                even[k++] = arry[i];
            } else {
                Odd[l++] = arry[i];
            }
        }
        System.out.print("even values=");
        for (int i = 0; i < k; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();
        System.out.print("odd values=");
        for (int i = 0; i < l; i++) {
            System.out.print(Odd[i] + " ");
        }

    }

    public static void main(String[] args) {
        System.out.print("enter size=");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arry[] = new int[size];
        System.out.print("enter elements in array=");
        for (int i = 0; i < size; i++) {
            arry[i] = sc.nextInt();
        }

        giveOddEven(arry, size);

    }
}
/*
 * enter size=8
 * enter elements in array=1 2 3 4 5 6 7 8
 * even values=2 4 6 8
 * odd values=1 3 5 7
 */