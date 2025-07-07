import java.util.Scanner;

public class rowsum {
    public static int[] rowSum(int mat[][]) {
        // Code here
        int list[]=new int[mat.length];
        for(int i=0;i<mat.length;i++){
            int sum = 0;
            for(int j=0;j<mat[i].length;j++){
                sum+=mat[i][j];
            }
            list[i]=sum;
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in array");
        int n=sc.nextInt();
        System.out.println("Enter the number of columns in array");
        int m=sc.nextInt();
        int mat[][]=new int[n][m];
        System.out.println("Enter the elements");
        for(int i =0; i< mat.length;i++){
            for(int j =0; j< mat[i].length;j++){
            mat[i][j]=sc.nextInt();
        }
        }
        for (int x : rowSum(mat)) {
        System.out.print(x + " ");
        }
        sc.close();
    }
}
