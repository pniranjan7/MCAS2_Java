import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix: ");

        int n = sc.nextInt(); // Read matrix size (assuming square matrix)
        int[][] matrix = new int[n][n];

        // Read matrix elements
        System.err.println("Enter the elements of the matrix: ");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        // Check symmetry with early termination
        boolean symmetric = true;
        outerLoop:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) { // Check only lower triangle
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break outerLoop; // Exit immediately on mismatch
                }
            }
        }

        // Print result
        System.out.println(symmetric ? "Symmetric" : "Not Symmetric");

        sc.close();
        }
        }
