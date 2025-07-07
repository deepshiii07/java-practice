import java.util.Scanner;

public class columsum {
    public static int[] colSum(int mat[][]) {
        // Code here
        int list[]=new int[mat[0].length];
        for(int i=0;i<mat[0].length;i++){
            int sum = 0;
            for(int j=0;j<mat.length;j++){
                sum+=mat[j][i];
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
        for (int x : colSum(mat)) {
        System.out.print(x + " ");
        }
        sc.close();
    }
}
