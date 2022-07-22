
public class Day4_Q01 {
	/*
	 * 1. Create a string and practice string methods
	 */
	public static void main(String[] args) {

		String hello = "Hello there!";
		String hi = "Hi there!";
		
		//String Methods
		//.length()
		System.out.println(hello.length());
		
		//.toUpperCase()
		System.out.println(hello.toUpperCase());
		
		//.charAt()
		System.out.println(hello.charAt(4));
		
		//.concat()
		System.out.println(hello.concat(hi).concat("Welcome!"));
		
		//.split(delimiter)
		String split[] = hi.split(" ", 0);
		for (String s : split) {
			System.out.println(s);
		}

	}

}
