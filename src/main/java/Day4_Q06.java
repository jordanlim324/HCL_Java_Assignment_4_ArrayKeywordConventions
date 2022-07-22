
public class Day4_Q06 {
	/*
	 * 6. Create a 2D array and iterate it to display it in matrix format.
	 */
	public static void main(String[] args) {
		
		int intArray2D[][] = { {4, 8, 12}, {1, 6, 74}, {9, 8, 57} };
		
		for (int i = 0; i < intArray2D.length; i++) {
			for (int j = 0; j < intArray2D[0].length; j++) {
				System.out.print(intArray2D [i] [j] + " ");
			}
			System.out.println();
		}

	}

}
