class Solution {
    public String largestOddNumber(String s) {
        for(int i = s.length() - 1 ; i >= 0 ; i--) {
            char ch = s.charAt(i);
            if(ch % 2 != 0) {
                return s.substring(0 , i+1);
            }
        }
        return "";
    }
}
