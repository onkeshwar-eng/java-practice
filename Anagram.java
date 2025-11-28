package coading;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ram";
		String str2 = "amr";
		System.out.println("Given strings are character array:"+isAnagram(str1, str2));

	}
	
	public static boolean isAnagram(String s1, String s2) {
		if(s1==null || s2==null) {
			return false;
		}
		if(s1.length()!=s2.length()) {
			return false;
		}
		//convert string to char array
		char[] charArray1 = s1.toLowerCase().toCharArray();
		char[] charArray2 = s2.toLowerCase().toCharArray();
		
		//sort the character array
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		return Arrays.equals(charArray1, charArray2);
		
	}

}
