public class FrequencyCharacters {
    public static void main(String[] args) {
        String str = "picture perfect";  
        
        char[] arry=str.toCharArray();
        
        System.out.println("frequency of a Characters:-");
        for (int i = 0; i < str.length(); i++) {
            int count=1;
            if (arry[i]=='0'||arry[i]==' ') {
                continue;
            }
            for (int j = i+1; j < arry.length; j++) {
               
                if (arry[i]==arry[j] && arry[i]!=' ' && arry[i]!='0') {
                  count++;
                  arry[j]='0';
                }
            }
          System.out.println(arry[i]+"="+count);
        }
    }
}
