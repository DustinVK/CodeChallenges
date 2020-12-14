package vankrimpen.dustin;

/*
 *	Implement the "paint fill" function that one might find in an image editing program.
 *
 *	Given a screen (represented by a two-dimensional array of colors), a point, and a new color:
 *		* fill in the surrounding area until the color changes from the original color. 
 */

public class PaintFill {
	
	// initial call
	private static void paintFill(String[][] screen, int[] start, String nColor) {
		String oColor = screen[start[0]][start[1]]; // original color 
		paintFill(screen, start[0], start[1], oColor, nColor);
		
	}
	
	// Recursively fill while the current color == original color 
	private static void paintFill(String[][] screen, int r, int c, String oColor, String nColor) {
		// return if coordinates go out of bounds of the screen 
		if(r < 0 || r >= screen.length || c < 0 || c >= screen[0].length ) {
			return;
		}
		if (screen[r][c].equals(oColor)) {
			screen[r][c] = nColor;
			// call for each potential next value
			paintFill(screen, r+1,c, oColor, nColor);
			paintFill(screen, r-1,c, oColor, nColor);
			paintFill(screen, r,c+1, oColor, nColor);
			paintFill(screen, r,c-1, oColor, nColor);
			
		}
		return;
	}
	
	// prints the screen 
		public static void printScreen(String[][] screen) {
			for(String[] arr : screen) {
				for(String i : arr) {
					System.out.print("#");
					System.out.print(i);
					System.out.print(",");
				}
				System.out.println("");
			}
			System.out.println("");
		}
		
		
	public static void main(String[] args) {
		// screen is a 5x7 pixel white box with a 1 pixel wide diagonal black line running through it 
		String[][] screen = {
				{"FFFFFF","000000","FFFFFF","FFFFFF","FFFFFF","FFFFFF","FFFFFF"},
				{"FFFFFF","FFFFFF","000000","FFFFFF","FFFFFF","FFFFFF","FFFFFF"},
				{"FFFFFF","FFFFFF","FFFFFF","000000","FFFFFF","FFFFFF","FFFFFF"},
				{"FFFFFF","FFFFFF","FFFFFF","FFFFFF","000000","FFFFFF","FFFFFF"},
				{"FFFFFF","FFFFFF","FFFFFF","FFFFFF","FFFFFF","000000","FFFFFF"},
				
		};
		
		int[] startingIndex = {2,1}; // starting coordinates
		String newColor = "555555"; // Grey 
		
		System.out.println("Original screen:\n");
		printScreen(screen);
		paintFill(screen,startingIndex,newColor); 
		System.out.printf("Screen after performing paint fill. Starting from index {%d,%d} "
				+ "\nand replacing the original color with #%s:\n\n",startingIndex[0],startingIndex[1],newColor);
		printScreen(screen);
	}

}
