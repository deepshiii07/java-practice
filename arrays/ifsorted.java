import java.util.Scanner;

public class ifsorted {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int arr2[]={1,2,3,5,4,};
        boolean issorted=true;
        boolean issorted2=true;
        for(int i =1;i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                issorted=false;
                break;
            }
        }
        for(int i =1;i<arr2.length; i++){
            if(arr2[i]<arr2[i-1]){
                issorted2=false;
                break;
            }
        }
        System.out.println("1st Array = "+ issorted);
        System.out.println("2nd Array = "+ issorted2);

        //user input array
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i = 0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
           boolean ans = isSorted(a, n);
        if (ans == true) {
            System.out.println("Yes the user input array is sorted");
        } else {
            System.out.println("No the user input array is not sorted");
        }
        sc.close();
    }

    // Function to check if the array is sorted
    public static boolean isSorted(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                return false; 
            }
        }
        return true; 
    }
    }
