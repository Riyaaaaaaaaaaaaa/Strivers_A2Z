class Solution {
    public int reverseNumber(int n) {
        int reversed = 0;
        boolean isNegative = n < 0;
        n = Math.abs(n);

        while (n != 0) {
            int digit = n % 10;
            // Check for overflow (optional, based on 32-bit int limits)
            if (reversed > (Integer.MAX_VALUE - digit) / 10) {
                return 0; // overflow case
            }
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return isNegative ? -reversed : reversed;
    }
}
