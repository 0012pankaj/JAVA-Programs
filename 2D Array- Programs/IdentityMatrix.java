import java.util.Scanner;

public class IdentityMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter NO. of raws=");
        int r = sc.nextInt();
        System.out.print("Enter NO. of columns=");
        int c = sc.nextInt();
        int arry[][] = new int[r][c];
        System.out.println("Enter elements raw wise:-");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arry[i][j] = sc.nextInt();

            }

        }
        boolean flag = true;
        if (r != c) {
            flag = false;
            System.out.println(" matrix is not square matrix hence not Identical also!!");
            System.exit(0);
            ;

        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == j) {
                    if (arry[i][j] != 1) {
                        flag = false;
                        System.out.println("matri is not identity matrix");
                        break;
                    }
                } else {
                    if (arry[i][j] != 0) {
                        flag = false;
                        System.out.println("matrix is not identity matrix");
                        break;
                    }

                }

            }

        }
        if (flag) {
            System.out.println("Identity matrix!");
        }
    }
}

/*Enter NO. of raws=3
Enter NO. of columns=3
Enter elements raw wise:-
1 0 0
0 1 0
0 0 1
Identity matrix!*/

/*Enter NO. of raws=3  
Enter NO. of columns=3
Enter elements raw wise:-
1 0 0
0 1 1
0 0 1
matrix is not identity matrix*/