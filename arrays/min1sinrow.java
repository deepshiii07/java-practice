import java.util.Scanner;

public class min1sinrow {

    int minRow(int mat[][]) {
        int minOnes = Integer.MAX_VALUE;
        int minRowIndex = 1; // default to first row (1-based)

        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }

            // If this row has fewer 1s, or same number but smaller index
            if (count < minOnes) {
                minOnes = count;
                minRowIndex = i + 1; // Convert to 1-based index
            }
        }

        return minRowIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in array");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns in array");
        int m = sc.nextInt();

        int mat[][] = new int[n][m];
        System.out.println("Enter the elements (0s and 1s):");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        min1sinrow obj = new min1sinrow();
        int ans = obj.minRow(mat);
        System.out.println("Row with the least number of 1s is: " + ans);

        sc.close();
    }
}
