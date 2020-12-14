package vankrimpen.dustin;

/*
 * Zero Matrix
 * 
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
 * 
 */

public class ZeroMatrix {
	
	// modifies a matrix to set every element in a row or column containing a zero value to zero 
	private static void zeroMatrix(int[][] matrix){
		// keep track of the rows and columns to set zero
		boolean[]zeroRows = new boolean[matrix.length];
		boolean[] zeroColumns = new boolean[matrix[0].length];
		
		// mark zero rows and columns
		for(int i = 0;i<zeroRows.length;i++) {
			for(int j = 0; j<zeroColumns.length;j++) {
				if(matrix[i][j] == 0) {
					zeroRows[i] = true;
					zeroColumns[j] = true;
				}
			}
		}
		
		// set zero rows 
		for(int i = 0;i<zeroRows.length;i++) {
			if(zeroRows[i] == true) {
				for(int j = 0; j<zeroColumns.length;j++) {
					matrix[i][j] = 0;
				}
			}
		}
		
		// set zero columns
		for(int i = 0;i<zeroColumns.length;i++) {
			if(zeroColumns[i] == true) {
				for(int j = 0; j<zeroRows.length;j++) {
					matrix[j][i] = 0;
				}
			}
		}
		
		
	}
	
	// prints a matrix 
	public static void printMatrix(int[][] matrix) {
		for(int[] arr : matrix) {
			for(int i : arr) {
				System.out.print(i);
				System.out.print(",");
			}
			System.out.println("");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		
		int[][] matrix = {
				{5,2,3,4},
				{1,7,0,3},
				{7,6,3,8},
				{0,1,1,2},
				{4,8,3,7}		
		};
		System.out.println("Original Matrix");
		printMatrix(matrix);
		System.out.println("");
		
		System.out.println("Zeroed Matrix");
		zeroMatrix(matrix);
		printMatrix(matrix);
		
	}
	
}
