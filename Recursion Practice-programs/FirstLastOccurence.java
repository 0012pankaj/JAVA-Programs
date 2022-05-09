import java.util.Scanner;

public class FirstLastOccurence {
    public static int first=-1;
    public static int last=-1;
    public static void firstlast(String str,int i,char ch){
        if (i==str.length()) {
            System.out.println("first="+first);
            System.out.println("last= "+last);
            return;
        }
        if (ch==str.charAt(i)) {
            if (first==-1) {
                first=i;
            }else{
                last=i;
            }
        }
        firstlast(str,i+1,ch);

    }
    public static void main(String[] args) {
        String str ="ahndfvaandchakl";
        System.out.print("enter elements=");
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        firstlast(str,0,ch);
    }
}
