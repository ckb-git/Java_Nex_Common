package bhubaneswar;
import java.util.*;
public class Longest_Substring_Without_Repeating_Characters {

	public static int lengthOfLongestSubstring(String s) {
		HashMap<Character, Integer> charIndexMap = new HashMap<>();
		int start = 0;
		int maxLength = 0;
		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);
			if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= start) {
				start = charIndexMap.get(currentChar) + 1;
			}
			charIndexMap.put(currentChar, i);
			maxLength = Math.max(maxLength, i - start + 1);
		}

		return maxLength;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(lengthOfLongestSubstring("abcabcbb"));  // Output: 3   (abc)
		System.out.println(lengthOfLongestSubstring("bbbbb"));     // Output: 1     (b)
	}

}


