import java.lang.reflect.Array;

public class ReverseWordString {
    public static void main(String[] args) {
        String str="pankaj code daily on vscode.";
        System.out.println("Orignal string:-"+str);
        String[] string=str.split(" ");
        String[] rstring=new String[string.length];
        String strr=" ";
        System.out.print("Reverse word string:-");
        for (int k=0, i = string.length-1; i >=0; i--,k++) {
            // rstring[k]=string[i];
            strr=strr+string[i]+" ";
          
        // }
        // for (int i = 0; i < rstring.length; i++) {
        //     System.out.print(rstring[i]+" ");
        // }        
    }
    System.out.println(strr);
}
}