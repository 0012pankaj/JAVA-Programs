/*Program to print the elements of an array present on even position*/

import java.util.Scanner;

public class evenPositionprint {
    public static void main(String[] args) {
          
  
    System.out.print("Enter size=");
    Scanner sc=new Scanner(System.in);
    int size= sc.nextInt();
    int arry[]= new int[size];
    System.out.print("Enter elementes in array=");
    for (int i = 0; i <size; i++) {
        arry[i]=sc.nextInt();
    }
    System.out.print("Elements at even position are-");
    for (int i = 1; i < arry.length; i=i+2) {
        System.out.print(arry[i]+" ");
    }
}
}
/*Enter size=6
Enter elementes in array=1 2 3 4 5 6
Elements at even position are-2 4 6 */