package String;

import java.util.Scanner;

public class SliceString {
    // User function Template for Java

// functions should slice the given string
// i.e. remove the first and the last character
// of the given string and return the sliced
// string
    public static String sliceString(String s) {
        // code here
        int n=s.length();
        String S1 = s.substring(1, n-1);
        return S1;
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(sliceString(s));
        sc.close();
    }
}
