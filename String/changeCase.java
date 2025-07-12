package String;
import java.util.Scanner;

public class changeCase extends alphabets {
// function to print the two string
// first string: the first character is changed
// to uppercase
// second string: complete string is changed
// to upper case.
// print both the string in new line.

    public static void ChangeCase(String s) {
        // code here
        String S1= s.substring(0,1).toUpperCase() + s.substring(1);
        System.out.println(S1);
        String S2= s.toUpperCase();
        System.out.println(S2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c1 = 'A';
        char c2 = 'P';
        ChangeCase(s);
        Alphabets(c1,c2);

        sc.close();
    }

}
