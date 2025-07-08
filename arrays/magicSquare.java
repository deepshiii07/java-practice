import java.util.HashSet;
import java.util.Scanner;

public class magicSquare {
    public String ifMagicSquare(int mat[][], int n){
        int magicSum=0;
        HashSet<Integer> seen = new HashSet<>();
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                int val=mat[i][j];
                if(val<1 || val>n*n || !seen.add(val)){
                    return "Not a Magic Square";
                }
            }
        }

        //sum of first row
         for(int j=0; j<n;j++){
         magicSum += mat[0][j];
         }

        //compare it with rest of the rows sums
        for(int i=0;i<n;i++){
            int rowSum = 0;
            for(int j=0;j<n;j++){
                rowSum += mat[i][j];
            }
            if(rowSum != magicSum){
                return "Not a Magic Square";
            }
        }

        //compare it with the column sums
        for(int j=0;j<n;j++){
            int colSum = 0;
            for(int i=0;i<n;i++){
                colSum += mat[i][j];
            }
            if(colSum != magicSum){
                return "Not a Magic Square";
            }
        }
        //Diagonals
        int diag1Sum=0;
        for(int i=0; i<n;i++){
            diag1Sum += mat[i][i];
        }
        if(diag1Sum != magicSum){
            return "Not a Magic Square";
        }
        int diag2Sum=0;
        for(int i=0; i<n;i++){
            diag2Sum += mat[i][n-1-i];
        }
        if(diag2Sum != magicSum){
            return "Not a Magic Square";
        }
    return "Magic Square";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        int mat[][]=new int[n][n];
        System.out.println("Enter the elements");
        for(int i =0; i< mat.length;i++){
            for(int j =0; j< mat[i].length;j++){
            mat[i][j]=sc.nextInt();
            }
        }
        magicSquare obj = new magicSquare();
        System.out.println(obj.ifMagicSquare(mat, n));
        sc.close();
    }
}
