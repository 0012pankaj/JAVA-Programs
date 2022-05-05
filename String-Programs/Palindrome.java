import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print("enter string= ");
        Scanner sc=new Scanner(System.in);
        String str =sc.nextLine();
        boolean flag=true;
        for (int i = 0; i <str.length()/2; i++) {
            if (str.charAt(i)!= str.charAt(str.length()-1-i)) {
                System.out.println("String is Not palandrom !!");
                flag=false;
                break;
            }
        }
        if (flag) {
            System.out.println("String is  palandrom .");
            
        }
    }
}
/* enter string= poop
String is  palandrom .*/
/*enter string= papa
String is Not palandrom !!*/
