package leetcode;

public class MatrixMultiplication {
	public static void main(String[] args) {
		int[][] matrixA = { { 1, 2, 3 }, { 4, 5, 6 } };

		int[][] matrixB = { { 7, 8 }, { 9, 10 }, { 11, 12 } };

		// Dimensions of matrix A: 2x3
		// Dimensions of matrix B: 3x2
		// Resultant matrix dimensions: 2x2

		int rowsA = matrixA.length;
		int colsA = matrixA[0].length;
		int rowsB = matrixB.length;
		int colsB = matrixB[0].length;

		// Check if multiplication is possible
		if (colsA != rowsB) {
			System.out.println("Matrix multiplication is not possible.");
			return;
		}

		// Resultant matrix
		int[][] resultMatrix = new int[rowsA][colsB];

		// Perform multiplication
		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < colsB; j++) {
				for (int k = 0; k < colsA; k++) {
					resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
				}
			}
		}

		// Print the result
		System.out.println("Resultant Matrix:");
		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < colsB; j++) {
				System.out.print(resultMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}