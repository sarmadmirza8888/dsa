/*
 * ------------------------------------------------------------
 * Problem    : 125. Valid Palindrome
 * File       : ValidPalindromeBrute.java
 * Approach   : Brute Force (Clean String + Reverse)
 *
 * Description:
 * Remove all non-alphanumeric characters and convert the
 * remaining characters to lowercase. Reverse the cleaned
 * string and compare it with the original cleaned string.
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
class ValidPalindromeBrute {
    public boolean isPalindrome(String s) {
        // Store only lowercase letters and digits
        StringBuilder cleanedString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentCharacter = s.charAt(i);
            // Ignore non-alphanumeric characters
            if (Character.isLetterOrDigit(currentCharacter)) {
                cleanedString.append(Character.toLowerCase(currentCharacter));
            }
        }
        // Reverse the cleaned string
        String reversedString = new StringBuilder(cleanedString).reverse().toString();
        // Compare both strings
        return cleanedString.toString().equals(reversedString);
    }
    public static void main(String[] args) {
        ValidPalindromeBrute solution = new ValidPalindromeBrute();
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";
        System.out.println(solution.isPalindrome(s1));
        System.out.println(solution.isPalindrome(s2));
        System.out.println(solution.isPalindrome(s3));
    }
}