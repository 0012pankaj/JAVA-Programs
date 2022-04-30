import java.util.Scanner;

public class MultiplyTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of raws 1=");
        int r = sc.nextInt();
        System.out.print("Enter No of columns 1=");
        int c = sc.nextInt();
        System.out.print("Enter No of raws 2=");
        int r2 = sc.nextInt();
        System.out.print("Enter No of columns 2=");
        int c2 = sc.nextInt();
        int arry1[][] = new int[r][c];
        int arry2[][] = new int[r][c];
        int arry3[][] = new int[r][c];

        System.out.println("enter elements of matrix 1(raw wise):-");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arry1[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter elements of matrix 2(raw wise):-");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arry2[i][j] = sc.nextInt();
            }
        }
        if(c != r2){    
            System.out.println("Matrices cannot be multiplied");    
        }    

        System.out.println("On mutiplying two matrices we get:-");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c2; j++) {
                arry3[i][j] = 0;
                for (int k = 0; k < r; k++) {
                    arry3[i][j] += arry1[i][k] * arry2[k][j];
                }
                
                System.out.print(arry3[i][j] + " ");
            }
            System.out.println();

        }

    }
}
/*Enter No of raws=3
Enter No of columns=3
enter elements of matrix 1(raw wise):-
1 1 1
2 2 2
3 3 3
enter elements of matrix 2(raw wise):-
1 1 1
2 2 2
3 3 3
On mutiplying two matrices we get:-
6 6 6 
12 12 12
18 18 18*/