import java.util.Scanner;

public class DivideEqualparts {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter string=");
        String str1=sc.nextLine();

        System.out.print("Enter No. of Equal parts of division you want=");
        int n=sc.nextInt(),a;

        if (str1.length()%n==0) {  // check it can divide or not
            n=str1.length()/n;   //no. of characters in each part
            a=n;
            for (int i = 0; i < str1.length(); i++ ){
               
                if (i==n) {
                    System.out.println();
                    n=n+a;
                }
                System.out.print(str1.charAt(i));
            }
            
        }else{
            System.out.println("String cannotdivide in  equally!! part!! ");
        }
    }
}
/*Enter string=manpancanrunsun
Enter No. of Equal parts of division you want=5
man
pan
can
run
sun*/
/*Enter string=aaaabbbbcccc
Enter No. of Equal parts of division you want=3
aaaa
bbbb
cccc*/