import java.util.Scanner;

public class pritRiverse {
   public static void main(String[] args) {
       System.out.print("Enter size=");
       Scanner sc=new Scanner(System.in);
       int size= sc.nextInt();
       int arry[]= new int[size];
       System.out.print("Enter elementes in array=");
       for (int i = 0; i <size; i++) {
           arry[i]=sc.nextInt();
       }
       System.out.print("In reverse order=");
       for (int i = size-1; i>=0; i--) {
           System.out.print(arry[i]+" ");
       }
   } 
}
/*Enter size=5
Enter elementes in array=1 2 3 4 5
In reverse order=5 4 3 2 1 */