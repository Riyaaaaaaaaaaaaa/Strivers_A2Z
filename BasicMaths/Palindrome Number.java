class Solution {
    public boolean isPalindrome(int n) {
        int num = n;
        int rev = 0;
        while(n > 0) {
            int remain = n % 10;
            rev = rev * 10 + remain;
            n /= 10;
        }
        if(rev != num) {
            return false;
        }
        return true;
    }
}
