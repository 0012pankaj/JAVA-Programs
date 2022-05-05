public class DuplicateCharacter {
    public static void main(String[] args) {
        String str="Great responsibility";
        int count=0;
        char[] ch=str.toCharArray();
     
        System.out.println("dublicate charector:-");
        for (int i = 0; i < str.length(); i++) {
           count=1;
            for (int j = i+1; j < str.length(); j++) {
              if (ch[i]==ch[j] && ch[i]!=' ') {
                count++;
                 ch[j]='0';
              }
            }
            if (count > 1 && ch[i]!='0') {
                System.out.print(ch[i]+" ");
            }
        
        }
    }
}
/* Java program to find the duplicate characters in a string
dublicate charector:-
r e t s i */
