import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    // Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                // Left to right
                for (int j = 0; j < matrix[i].length; j++) {
                    result.add(matrix[i][j]);
                }
            } else {
                // Right to left
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    result.add(matrix[i][j]);
                }
            }
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int matrix[][] = new int[n][n];

        // Input matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Get snake pattern result
        ArrayList<Integer> res = snakePattern(matrix);

        // Print result
        for (int x : res) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
