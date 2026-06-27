/*
 * ------------------------------------------------------------
 * Problem    : 125. Valid Palindrome
 * File       : ValidPalindromeOptimal.java
 * Approach   : Optimal (Two Pointers)
 *
 * Description:
 * Use two pointers starting from both ends of the string.
 * Skip non-alphanumeric characters and compare lowercase
 * characters. If all matching characters are equal, the
 * string is a valid palindrome.
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
class ValidPalindromeOptimal {
    public boolean isPalindrome(String s) {
        // Pointer at the beginning
        int left = 0;
        // Pointer at the end
        int right = s.length() - 1;
        // Continue until both pointers meet
        while (left < right) {
            // Skip non-alphanumeric characters from the left
            while (left < right &&
                    !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Skip non-alphanumeric characters from the right
            while (left < right &&
                    !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            // Compare lowercase characters
            if (Character.toLowerCase(s.charAt(left)) !=
                    Character.toLowerCase(s.charAt(right))) {

                return false;
            }
            // Move both pointers
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        ValidPalindromeOptimal solution = new ValidPalindromeOptimal();
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";
        System.out.println(solution.isPalindrome(s1));
        System.out.println(solution.isPalindrome(s2));
        System.out.println(solution.isPalindrome(s3));
    }
}