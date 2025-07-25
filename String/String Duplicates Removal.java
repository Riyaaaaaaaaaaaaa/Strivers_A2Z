class Solution {
    String removeDuplicates(String s) {
        Set<Character> str = new HashSet<>();
        
        StringBuilder result = new StringBuilder();
        
        for(char ch : s.toCharArray()) {
            if(!str.contains(ch)) {
                str.add(ch);
                result.append(ch);
            }
        }
        return result.toString();
    }
}
