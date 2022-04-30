/*Java Program to add two matrices*/
import java.util.Scanner;

public class AddTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter NO. of raws=");
        int r = sc.nextInt();
        System.out.print("Enter NO. of columns=");
        int c = sc.nextInt();
        int arry1[][] = new int[r][c];
        int arry2[][] = new int[r][c];
        int arry3[][] = new int[r][c];

        System.out.println("Enter elements raw wise matrix 1:-");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arry1[i][j] = sc.nextInt();

            }

        }
        System.out.println("Enter elements raw wise matrix 2:-");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arry2[i][j] = sc.nextInt();

            }

        }
        System.out.println("sum of matri 1 and 2:-");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arry3[i][j] = arry1[i][j] + arry2[i][j]; // doing sum
                System.out.print(arry3[i][j] + " ");
            }
            System.out.println();

        }
    }
}
/*
 * Enter NO. of raws=3
 * Enter NO. of columns=3
 * Enter elements raw wise matrix 1:-
 * 1 2 3
 * 1 2 3
 * 1 2 3
 * Enter elements raw wise matrix 2:-
 * 3 2 1
 * 3 2 1
 * 3 2 1
 * sum of matri 1 and 2:-
 * 4 4 4
 * 4 4 4
 * 4 4 4
 */
