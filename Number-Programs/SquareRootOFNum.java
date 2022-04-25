import java.util.Scanner;

public class SquareRootOFNum {
    
    public static void main(String[] args) {
        System.out.print("enter num=");
        Scanner sc =new Scanner(System.in);
        double num = sc.nextDouble();
       
        for (double i =0.1; i<num; i+=0.1) {
            if (i*i==num) {
                System.out.println(i);
                break;
            }
            
    }
}
}