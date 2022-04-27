/*Program to print the smallest element in an array*/

import java.util.Scanner;

public class SmallestElement {
    static int smallestElement(int arry[], int size) {
        int min = arry[0];
        for (int i = 0; i < arry.length; i++) {
            if (min > arry[i]) {
                min = arry[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.print("Enter size=");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arry[] = new int[size];
        System.out.print("Enter elementes in array=");
        for (int i = 0; i < size; i++) {
            arry[i] = sc.nextInt();
        }
        System.out.print("Smallest element=" + smallestElement(arry, size));

    }
}
/*
 * Enter size=5
 * Enter elementes in array=11 33 55 77 99
 * Smallest element=11
 */