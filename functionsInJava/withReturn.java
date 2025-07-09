package functionsInJava;
import java.util.Scanner;

public class withReturn {
    public static int withReturnValue(int n){
        int m = n*2;
        return m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(withReturnValue(n));
        sc.close();
    }
}
