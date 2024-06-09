package leetcode;

public class SetMatrixZeroes {

	public static void setMatrixZeroes(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		boolean row = false;
		boolean col = false;
		for (int i = 0; i < m; i++) {
			if (matrix[i][0] == 0) {
				col = true;
				break;
			}
		}
		for (int i = 0; i < n; i++) {
			if (matrix[0][i] == 0) {
				row = true;
				break;
			}
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if (matrix[0][j] == 0 || matrix[i][0] == 0) {
					matrix[i][j] = 0;
				}
			}
		}
		if (row) {
			for (int i = 0; i < n; i++) {
				matrix[0][i] = 0;
			}
		}
		if (col) {
			for (int i = 0; i < m; i++) {
				matrix[i][0] = 0;
			}
		}

	}

	// Driver Code
	public static void main(String[] args) {
		int[][] matrix = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };

		// Function call
		setMatrixZeroes(matrix);

		// Print the resulting matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
