
public class Day4_Q02 {
	/*
	 * 2. Create a stringbuffer and practice its methods.
	 */
	public static void main(String[] args) {
		
		String str = "I like money!";
		StringBuffer sb = new StringBuffer(str);
		
		//StringBuffer Methods
		//.length()
		System.out.println(sb.length());
		//.capacity()
		System.out.println(sb.capacity());
		//.insert(int, String)
		System.out.println(sb.insert(7, "Hello, "));
		//.delete(start_index, no_of_chars)
		System.out.println(sb.delete(0, 7));
		//.append(String)
		System.out.println(sb.append(" Paycheck, please!"));
		//.reverse()
		System.out.println(sb.reverse());
		
	}

}
