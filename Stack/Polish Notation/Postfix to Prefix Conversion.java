import java.util.Stack;
class Solution {
    public String postToPre(String s) {
        // Your code goes here
        Stack<String> stack = new Stack<>();

        for (int i = 0 ; i < s.length() ; i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                stack.push(Character.toString(ch));
            } else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String temp = ch + op2 + op1;
                stack.push(temp);
            }
        }
        return stack.peek();
    }
}
