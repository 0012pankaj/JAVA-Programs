public class DuplicateString {
    public static void main(String[] args) {
        String str = "Big black bug bit a big black dog on his big black nose";
        String[] arry = str.split(" ");
        System.out.println("Duplicate words are:-");
        for (int i = 0; i < arry.length; i++) {
            int count=1;
            for (int j = i + 1; j < arry.length; j++) {
                // if (arry[i]==arry[j] && arry[i]!= "ooo") {
                // System.out.println(arry[i]+" ");
                // arry[j]="ooo";
                // }
                if (arry[i].equals(arry[j]) && arry[i] != "ooo"){
                   count++;
                    arry[j]="ooo";
                    }
                    
                }
                if (count>1) {
                    System.out.println(arry[i]+" ");
                }
            }
        }
    
}