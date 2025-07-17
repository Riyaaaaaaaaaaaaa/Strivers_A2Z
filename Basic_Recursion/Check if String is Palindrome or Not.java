class Solution {   
    public boolean palindromeCheck(String s) {
        //your code goes here
        char str[] = s.toCharArray();
        int i = 0;
        int j = str.length - 1;

        while(i < j) {
            if(str[i] != str[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
