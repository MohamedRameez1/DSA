package Graph;

public class FloodFillAlgorithm {

	public static void main(String[] args) {
		int [][] image = {
				{1,1,1,2,2},
				{1,1,1,2,2},
				{1,1,2,2,2},
				{3,3,3,3,3},
				{3,3,3,3,3}
				
		};
		System.out.println("Original Image: ");
		printImage(image);
		
		int startRow =2, startCol =2;
		int oldColor = image[startRow][startCol];
		int newColor =4;

		floodFill(image,startRow,startCol, oldColor,newColor);
		
		System.out.println("\nImage after Flood Fill: ");
		printImage(image);
	}
	
	public static void floodFill(int[][]image, int row,int col,int oldColor,int newColor) {
		int rows = image.length;
	int cols = image[0].length;
	
	// Base cases to check if the pixel is within the image boundaries and has the old color
	if(row < 0 || row>=rows || col<0 || col >=cols || image[row][col] != oldColor) {
	
	return;
		
}
	
	// change the color of the current pixel
	image[row][col] = newColor;
	
	// Recursively fill the neighboring pixels
	floodFill(image,row + 1, col, oldColor, newColor);  // Down
	floodFill(image,row - 1, col, oldColor, newColor);  // up
	floodFill(image,row,col+1, oldColor, newColor);     // Right
	floodFill(image,row, col - 1, oldColor, newColor);  // Left
	
	}
	public static void printImage(int[][] image) {
		for (int[] row : image) {
			for(int pixel : row)  {
				System.out.print(pixel + " ");
			}
		
		System.out.println();
		}
	}
}

	
	
	
	
