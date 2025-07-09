package functionsInJava;

import java.util.Scanner;

public class GCD {
    // This function should print the prime factorization
    // of the number n
    // The new line is given by the driver's code.
    public static boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void printPrimeFactorization(int n) {
        // code here
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                while(n%i==0){
                    System.out.print(i+" ");
                    n=n/i;
                }
            }
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPrimeFactorization(n);
        sc.close();
    }
}

