package coading;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HighestOccuringCharacter {
	static int frequencyOfCharacterInString(char ch, String str) {
		int freq= 0;
		for(int i=0;i<str.length();i++) {
			if(ch==str.charAt(i)) {
				freq++;
			}
		}
		return freq;
	}
	public static String removeDuplicate(String inputString) {
		if(inputString==null || inputString.isEmpty()) {
			return inputString;
		}
		Set<Character> uniqueCharacter = new LinkedHashSet<>();
		for(char ch : inputString.toCharArray()) {
			uniqueCharacter.add(ch);
		}
		StringBuilder sb = new StringBuilder();
		for (char character : uniqueCharacter) {
			sb.append(character);
		}
		return sb.toString();
	}
	public static Character getMaximumOcuuredCharacterInString(String stringValue) {
		TreeMap<Character,Integer> tm = new TreeMap<Character, Integer>();
		String uniqueCharacterString = removeDuplicate(stringValue);
		for (Character ch : uniqueCharacterString.toCharArray()) {
			tm.put(ch, frequencyOfCharacterInString(ch, stringValue));
		}
		Character maxKey = null;
		Integer maxValue = Integer.MIN_VALUE;
		for(Map.Entry<Character, Integer> entry : tm.entrySet()) {
			if(entry.getValue()>maxValue) {
				maxValue = entry.getValue();
				maxKey = entry.getKey();
			}
		}
		return maxKey;
		
	}
	
	public static void main(String[] args) {
		String str = "test";
		System.out.println("Maximum Occuring character: "+getMaximumOcuuredCharacterInString(str));
	}

}
