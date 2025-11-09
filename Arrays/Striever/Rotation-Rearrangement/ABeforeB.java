// File: ABeforeB.java

class ABeforeB {
    public boolean checkString(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == 'b' && s.charAt(i) == 'a') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ABeforeB solver = new ABeforeB();

        // Sample test cases
        String s1 = "aaabbb";
        String s2 = "abab";
        String s3 = "bbb";
        String s4 = "aaa";

        System.out.println(s1 + " → " + solver.checkString(s1)); // true
        System.out.println(s2 + " → " + solver.checkString(s2)); // false
        System.out.println(s3 + " → " + solver.checkString(s3)); // true
        System.out.println(s4 + " → " + solver.checkString(s4)); // true
    }
}

/*
Problem: Check if All 'a's Appear Before All 'b's

Given a string s consisting only of characters 'a' and 'b',
return true if all 'a' characters in s appear before all 'b' characters.
Otherwise, return false.

Example 1:
Input: s = "aaabbb"
Output: true

Example 2:
Input: s = "abab"
Output: false

Example 3:
Input: s = "bbb"
Output: true

Example 4:
Input: s = "aaa"
Output: true

Approach:
- Traverse the string from left to right.
- If we ever encounter a 'b' followed directly by an 'a' (substring "ba"),
  then the string is invalid, return false.
- If no such case exists, return true.

Time Complexity: O(n), where n = length of the string (single pass).
Space Complexity: O(1), only constant extra space is used.
*/
