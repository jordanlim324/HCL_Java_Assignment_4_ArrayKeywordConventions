
public class Day4_Q03 {
	/*
	 * 3. Create a stringbuilder and practice its methods.
	 */
	public static void main(String[] args) {
		
		String str = "Lets go eat food!";
		StringBuilder sb = new StringBuilder(str);
		
		//StringBuffer Methods
		//.length()
		System.out.println(sb.length());
		//.capacity()
		System.out.println(sb.capacity());
		//.insert(int, String)
		System.out.println(sb.insert(0, "Hello, "));
		//.delete(start_index, no_of_chars)
		System.out.println(sb.delete(0, 7));
		//.append(String)
		System.out.println(sb.append(" Where to eat?"));
		//.reverse()
		System.out.println(sb.reverse());

	}

}
