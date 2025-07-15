package DSArrays;

import java.util.Scanner;

public class secondLargesti {
    public static int secondLargest(int[][] arr){
        int second=Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int[] matrix: arr){
            for(int val:matrix){
                if(val>largest){
                    second=largest;
                    largest=val;
                }
                else if(val>second && val!=largest){
                    second=val;
                }
            }
        }
        if(second==Integer.MIN_VALUE){
            return -1;
        }
        return second;
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i =0; i<n;i++){
            for(int j =0; j<m;j++){
            arr[i][j]=sc.nextInt();
        }
        }  
        System.out.print(secondLargest(arr));
        sc.close();
    }
}
