package String;

import java.util.Scanner;

public class countWords {
    // User function Template for Java
    // Complete the function
    // str: input string
     public static int countWordsof(String str) {
        // find and return the number of words
        // present in the string
            if(str==null|| str.trim().isEmpty()){
                return 0;
            }
            String [] words = str.trim().split("\\s+");
            return words.length;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            String str = sc.nextLine();
            int test = countWordsof(str);
            System.out.println(test);
            sc.close();
        }

}
