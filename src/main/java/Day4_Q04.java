
public class Day4_Q04 {
	/*
	 * 4. Create an integer array with 10 values.
	 * 	a) Find the sum of even numbers from the array.
	 * 	b) Find the sum of odd numbers from the array.
	 */
	public static void main(String[] args) {
		
		int numArray [] = {2, 8, 16, 88, 100, 55, 43, 67, 93, 11};
		
		//Even Numbers should add up to 214
		//Odd Numbers should add up to 269
		
		//4a
		
		int addSum = 0;
		
		for (int i = 0; i < numArray.length; i++) {
			if(numArray[i] % 2 == 0) {
				addSum += numArray[i];
			}
		}
		System.out.println(addSum);
		//4b
		
		int subtractSum = 0;
		
		for (int i = 0; i < numArray.length; i++) {
			if(numArray[i] % 2 == 1) {
				subtractSum += numArray[i];
			}
		}
		System.out.println(subtractSum); 
	}

}
