public class ReverseString{
    public static void Printrev(String str,int i){
        if (i==0) {
            System.out.print(str.charAt(i));
            return;
        }
     System.out.print(str.charAt(i));
     Printrev(str, i-1);
     
    }
    public static void main(String[] args) {
        String str="abcd";
        System.out.println("orignal string= "+str);
        System.out.print("reversed string= ");
        int i=str.length()-1;
        Printrev(str,i);
    }
}