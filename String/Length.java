package String;

import java.util.Scanner;

public class Length {
    // User function Template for Java
    // Complete the function
    // str: input string
    public static int lengthString(String str) {
        // find the length of string
        int n = str.length();
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(lengthString(str));
        sc.close();
    }
}

