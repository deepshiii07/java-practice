import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(averageofarray(arr,n));
        System.out.println(posAverage(arr));
        sc.close();
    }
    public static double averageofarray(int arr[],int n){
        double s=0;
        for(int i = 0; i<arr.length;i++){
            s+=arr[i];
        }
        double avg= s/n;
        return avg;
    }
    public static double posAverage(int[] arr) {
        // Code here
        double s=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                s+=arr[i];
                count++;
            }
        }
        double average= s/count;
        return average;
    }
    
}
