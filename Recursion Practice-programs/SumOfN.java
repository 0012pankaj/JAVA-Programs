/* sum upto n terms */

import java.util.Scanner;

public class SumOfN {
   public static void printsum(int i,int n,int sum){
       if (i==n) {
           sum=sum+n;
           System.out.print(sum);
           return ;
           
       }
     sum=sum+i;
     printsum( i+1, n, sum);
    }
    public static void main(String[] args) {
        System.out.print("Enter number upto which you want sum=");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        printsum(i,n,sum);
    }
}
