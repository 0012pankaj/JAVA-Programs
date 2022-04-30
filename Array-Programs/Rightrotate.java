/*Java Program to right rotate the elements of an array*/

import java.util.Scanner;

public class Rightrotate {
    static void  RightRotate(int arry[],int size,int n){
     while (n>0) {
         int n1=arry[size-1];
         for (int i = arry.length-1; i > 0; i--) {
             arry[i]=arry[i-1];
         }
         arry[0]=n1;
         n--;
     }
          System.out.print("Updated array =");
          for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i]+" ");
          }

    }
    public static void main(String[] args) {
        System.out.print("Enter size=");
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int[] arry=new int[size];
    
        System.out.print("Enter elments in array=");
        for (int i = 0; i <size; i++) {
            arry[i]=sc.nextInt();
        }
        System.out.print("Enter no of right turn=");
        int n = sc.nextInt();
        RightRotate(arry,size,n);

    }
    
}
/*Enter size=5
Enter elments in array=1 2 3 4 5
Enter no of right turn=2
Updated array =4 5 1 2 3 */