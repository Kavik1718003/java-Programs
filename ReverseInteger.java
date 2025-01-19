class ReverseInteger {
    public int reverse(int x) {
        int number = x;
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            
            // Check for overflow before updating reverse
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && remainder > 7)) {
                return 0; // Overflow for positive numbers
            }
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && remainder < -8)) {
                return 0; // Overflow for negative numbers
            }
            
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        return reverse;
    }
}
