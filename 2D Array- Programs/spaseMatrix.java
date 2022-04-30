/*Java Program to determine whether a given matrix is a sparse matrix*/

/*To check whether the given matrix is the sparse matrix or not,
 we first count the number of zero elements present in the matrix. 
 Then calculate the size of the matrix. For the matrix to be sparse, 
count of zero elements present in an array must be greater than size/2.*/

import java.util.Scanner;

public class spaseMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter NO. of raws=");
        int r = sc.nextInt();
        System.out.print("Enter NO. of columns=");
        int c = sc.nextInt();
        int arry[][] = new int[r][c];
        int count = 0;
        System.out.println("Enter elements raw wise:-");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arry[i][j] = sc.nextInt();
                if (arry[i][j] == 0) {
                    count++;

                }

            }

        }
        if (count > (r * c) / 2) {
            System.out.println("given matrix is sparce Matrix!!!");

        } else {
            System.out.println("given matrix is Not  sparce Matrix!!!");
        }

    }

}
/*
 * Enter NO. of columns=3
 * Enter elements raw wise:-
 * 1 2 3
 * 0 0 0
 * 0 0 0
 * given matrix is sparce Matrix!!!
 */
