package functionsInJava;

import java.util.Scanner;

public class firstDigit {
    public static int firstDigitOfNumber(int n) {
        // code here
        while(n>=10){
            n=n/10;
        }
        return n;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = firstDigitOfNumber(n);
        System.out.print(result);
        sc.close();
    }
}
