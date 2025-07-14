// LeetCode Problem 242. Valid Anagram

import java.util.Arrays;

// Optimized Approach 
public class L242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}

// Brute Approach
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        StringBuilder str = new StringBuilder(t);
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (s.charAt(i) == str.charAt(j)) {
                    str.delete(j, j + 1);
                    break;
                }
            }
        }
        if (str.length() == 0) {
            return true;
        }
        return false;
    }
}
/*
 * There are two strings given.
 * 
 * We convert one of them into a StringBuilder so that we can change (modify) it
 * easily.
 * 
 * Then, we loop through each character of the first string (s) and compare it
 * with characters of the second one (in StringBuilder).
 * 
 * If a matching character is found, we remove it from the StringBuilder.
 * 
 * After checking all characters, if the StringBuilder is empty, it means all
 * characters matched and got removed — so it's an anagram.
 * 
 * If something is left in StringBuilder, then it is not an anagram.
 */
