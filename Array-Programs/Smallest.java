import java.util.Scanner;

public class Smallest {
    static void giveSmallest(int arry[],int size){
        int s1 = arry[0];
        for (int i = 1; i < arry.length; i++) {
            if (arry[i] < s1) {
                s1 = arry[i];
            }
        }
        System.out.println("Smallest element is "+s1);
    }
    public static void main(String[] args) {
        System.out.print("Enter size=");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arry[] = new int[size];
        System.out.print("Enter elements in array=");
        for (int i = 0; i < arry.length; i++) {
            arry[i] = sc.nextInt();
        }
        giveSmallest(arry,size);
}
}
/*Enter size=5
Enter elements in array=5 3 8 2 9
Smallest element is 2*/