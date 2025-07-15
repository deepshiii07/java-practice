package DSArrays;
import java.util.*;

public class largestelement {
    public static int Largesti(int arr[][]){
        int largest=Integer.MIN_VALUE;
        int n=arr.length;
        int m=arr[0].length;
        for(int i =0; i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]>largest){
                    largest=arr[i][j];
                }
            }
        }
        return largest;
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
        System.out.print(Largesti(arr));
        sc.close();
    }
}


