package coading;

public class ReverseStringUsingStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String val = "Onkeshwar";
		System.out.println(reverseString(val));

	}
	public static String reverseString(String s1) {
		StringBuffer sb = new StringBuffer(s1);
		return sb.reverse().toString();
	}

}
