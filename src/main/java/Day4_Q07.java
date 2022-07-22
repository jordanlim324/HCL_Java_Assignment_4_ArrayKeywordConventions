
public class Day4_Q07 {
	/*
	 * 7. Write an example for pass by value and pass by reference.
	 */
	public static void main(String[] args) {
		
		int num = 500;
		System.out.println("Before: " + num);
		
		numbers(num); // Pass By Value
		System.out.println("After: " + num);
		
	}
	public static void numbers(int n) {
		
		System.out.println("This number is: " + n);
		
		n = 46; //Pass By Reference
		
		System.out.println("This new number is: " + n);
		
	}
}

