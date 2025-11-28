package coading;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class OccurenceOfEachCharacter_InA_String {

	public static void main(String[] args) {
		String s = "HelloBuddy";
		HashMap<Character, Integer> hm = new HashMap<>();
		for(char c : s.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		System.out.println("Character Occurrences:");
		for(Map.Entry<Character, Integer> entry: hm.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
