package coading;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "madam";
		String output = "";
		for(int i = input.length()-1;i>=0;i--) {
			output+=input.charAt(i);
		}
		if(input.equals(output)) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("Its not palindrome");
		}
	}
}
