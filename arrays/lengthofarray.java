import java.util.Scanner;

public class lengthofarray {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
       // Ask for array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print array length
        System.out.println(arr.length);
        sc.close();
    }
}
