/*Program to print the duplicate elements of an array*/

import java.util.Scanner;

public class printDuplicate {
    public static void giveDuplicate(int arry[], int size) {
        int visit[] = new int[arry.length];
        System.out.println("Duplicate Elements=");
        for (int i = 0; i < arry.length; i++) {
            if (visit[i] == 1) {
                continue;
            }
            for (int j = i + 1; j < arry.length; j++) {
                if (arry[i] == arry[j]) {
                    System.out.print(arry[i] + " ");
                    visit[j] = 1;

                }
            }
        }

    }

    public static void main(String[] args) {
        System.out.print("Enter size=");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arry[] = new int[size];
        System.out.print("Enter elements in array=");
        for (int i = 0; i < arry.length; i++) {
            arry[i] = sc.nextInt();
        }
        giveDuplicate(arry, size);

    }
}
/*
 * Enter size=8
 * Enter elements in array=1 2 2 3 4 4 5 6
 * Duplicate Elements=2 4
 */