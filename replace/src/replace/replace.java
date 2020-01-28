package replace;

public class replace {
	public static void main (String[]args) {
		String sentence2 = "   Rajasekhar has 1 shade ";
		System.out.println(sentence2.trim());
		
		System.out.println("Replace all the 'a' with 'e' ");
		String s1=" aaaaaaaaaaaaaaa ";
		String replaceString = s1.replace('a','e');
		System.out.println(replaceString);
		
	}

}
