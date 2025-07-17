class Solution {
    public boolean isPrime(int n) {
          //your code goes here
          if(n <= 0) {
            return false;
          }
          for(int i = 2 ; i < Math.sqrt(n) ; i++) {
            if(n %  i == 0) {
                return false;
            }
          }
          return true;
    }
}
