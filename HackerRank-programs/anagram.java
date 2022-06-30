import java.util.Scanner;

public class anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] a1 = a.toCharArray();
        char[] b1 = a.toCharArray();
        if (a1.length != b1.length) {
            return false;
        }
        int[] frq1 = new int[26];
        int[] feq2 = new int[26];
        for (int i = 0; i < a1.length; i++) {
            int count = 1;
            for (int j = i + 1; j < a1.length; j++) {
                if (a1[i] == a1[j] && a1[i] != '.') {
                    count++;
                    a1[j] = '.';
                }
            }
            if (a1[i] != '.') {
                frq1[a1[i] - 'a'] = count;
            }

        }
         //count2
         for (int i = 0; i < b1.length; i++) {
            int count = 1;
            for (int j = i + 1; j < b1.length; j++) {
                if (b1[i] == b1[j] && b1[i] != '.') {
                    count++;
                    b1[j] = '.';
                }
            }
            if (b1[i] != '.') {
                feq2[b1[i] - 'a'] = count;
            }

        }
 System.out.println(frq1);
 System.out.println(feq2);
        if (a1.equals(b1)) {
           return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}