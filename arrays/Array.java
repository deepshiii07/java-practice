import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter operation (+ - * /): ");
        char op = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        double result = 0;
        switch (op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': result = a / b; break;
            default: System.out.println("Invalid operator!");
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}

