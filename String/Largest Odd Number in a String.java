class Solution {
  public String largeOddNum(String s) {
    // your code goes here

    for (int i = s.length() - 1; i >= 0; i--) {
      int digit = s.charAt(i) - '0';
      if (digit % 2 != 0) {
        String sub = s.substring(0, i + 1);

        int j = 0;
        while (j < sub.length() && sub.charAt(j) == '0') {
          j++;
        }
        return j == sub.length() ? "" : sub.substring(j);
      }
    }
    return "";
  }
}
