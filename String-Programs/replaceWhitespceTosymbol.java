import java.util.Scanner;

public class replaceWhitespceTosymbol {
    public static void main(String[] args) {
        System.out.print("Enter string=");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.print("Enter symbol to replace=");
        char ch = sc.next().charAt(0);// take character input
        str=str.replace(' ',ch);
        System.out.println("Updated string:"+str);

    }
}
