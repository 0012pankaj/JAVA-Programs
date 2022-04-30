/*Java Program to find the sum of each row and each column of a matrix*/
import java.util.Scanner;

public class sumofEachRawCol {
   public static void main(String[] args) {
      System.out.print("enter no. of raws=");
      Scanner sc = new Scanner(System.in);
      int r = sc.nextInt();
      System.out.print("enter no. of columns=");
      int c = sc.nextInt();
      int arry[][] = new int[r][c];
      System.out.println("Enter elements in matrix:-");
      for (int i = 0; i < r; i++) {
         for (int j = 0; j < c; j++) {
            arry[i][j] = sc.nextInt();

         }

      }

      for (int i = 0; i < r; i++) {
         int sum = 0;
         for (int j = 0; j < c; j++) {
            sum += arry[i][j];
         }
         System.out.println("sum of elements of raw " + (i + 1) + " is = " + sum);
      }
      for (int i = 0; i < r; i++) {
         int sum = 0;
         for (int j = 0; j < c; j++) {
            sum += arry[j][i];
         }
         System.out.println("sum of elements of column " + (i + 1) + " is = " + sum);
      }
   }
}

/*
 * enter no. of raws=3
 * enter no. of columns=3
 * Enter elements in matrix:-
 * 1 1 1
 * 2 2 2
 * 3 3 3
 * sum of elements of raw 1 is = 3
 * sum of elements of raw 2 is = 6
 * sum of elements of raw 3 is = 9
 * sum of elements of column 1 is = 6
 * sum of elements of column 2 is = 6
 * sum of elements of column 3 is = 6
 */
