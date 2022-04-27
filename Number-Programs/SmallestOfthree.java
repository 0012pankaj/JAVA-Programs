import java.util.Scanner;
/*Java Program to Find Smallest of Three Numbers Using Ternary Operator*/
public class SmallestOfthree{
    public static void main(String[] args) {
        System.out.println("Enter three numbers to compare=");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number.a=");
        int a = sc.nextInt();
        System.out.print("Enter number.b=");
        int b = sc.nextInt();
        System.out.print("Enter number.c=");
        int c = sc.nextInt();
       int temp,smallest;
    //    temp=a<b?a:b;
    //    smallest=temp<c?temp:c;
      smallest=(a<b?a:b)<c?(a<b?a:b):c;
       System.out.println("smallest="+smallest);
    }
}

/*Enter three numbers to compare=
Enter number.a=3
Enter number.b=2
Enter number.c=5
smallest=2*/