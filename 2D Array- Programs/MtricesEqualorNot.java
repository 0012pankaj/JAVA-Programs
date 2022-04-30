import java.util.Scanner;

public class MtricesEqualorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter raw of matrix 1=");
        int r1 = sc.nextInt();
        System.out.print("enter column of matrix 1=");
        int c1 = sc.nextInt();
        System.out.print("enter raw of matrix 2=");
        int r2 = sc.nextInt();
        System.out.print("enter column of matrix 2=");
        int c2 = sc.nextInt();
        boolean flag = true;
        int arry1[][] = new int[r1][c1];
        int arry2[][] = new int[r2][c2];
        System.out.println("Enter elements raw wise matrix 1:-");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arry1[i][j] = sc.nextInt();

            }

        }
        System.out.println("Enter elements raw wise matrix 2:-");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arry2[i][j] = sc.nextInt();

            }

        }
        // check raws and columns are equal or not
        if (r1 != r2 || c1 != c2) {
            flag = false;
          
        }

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                if (arry1[i][j] != arry2[i][j]) {
                   
                    flag = false;

                    break;

                }
            }

        }

        if (flag) {

            System.out.println("Matrices are  Equal!!");
        } else {
            System.out.println("Matrices are Not Equal!!");
        }

    }
}


/*enter raw of matrix 1=3
enter column of matrix 1=3
enter raw of matrix 2=3
enter column of matrix 2=3
Enter elements raw wise matrix 1:-
1 1 1 
1 1 1
Enter elements raw wise matrix 2:-
1 1 1
1 1 1
1 1 1
Matrices are  Equal!!
///////////////////////////////////////////////
enter raw of matrix 1=3
enter column of matrix 1=3
enter raw of matrix 2=3
enter column of matrix 2=3
Enter elements raw wise matrix 1:-
1 2 3
1 2 3
1 2 3
Enter elements raw wise matrix 2:-
1 2 3
1 2 3
1 3 3
Matrices are Not Equal!!*/