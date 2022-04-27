import java.util.Scanner;

public class SumOfelement {
    public static void main(String[] args) {
        System.out.println("Enter size=");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int sum = 0, arry[] = new int[size];
        System.out.print("Enter elements in the array=");
        for (int i = 0; i < arry.length; i++) {
            arry[i] = sc.nextInt();
            sum += arry[i];  //sum
        }
        System.out.println("Sum of elements =" + sum);
    }
}
/*Enter size=
5
Enter elements in the array=2 2 2 2 2 2
Sum of elements =10*/
