class Solution {
  public boolean isArmstrong(int num) {
    int originalNum = num;
        int sum = 0;

        int digits = 0;
        int temp = num;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == originalNum;
  }
}
