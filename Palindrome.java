class Palindrome {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) return false;

        // Store the original number
        int original = x;
        int reverse = 0;

        // Reverse the integer
        while (x != 0) {
            int digit = x % 10; // Extract the last digit
            reverse = reverse * 10 + digit; // Build the reversed number
            x /= 10; // Remove the last digit
        }

        // Compare the reversed number with the original
        return reverse == original;
    }
}
