class Solution {
    public String prefixToInfix(String s) {
        // Your code goes here
        Stack<String> stack = new Stack<>();

        for(int i = s.length() - 1 ; i >= 0 ; i--) {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)) {
                stack.push(Character.toString(ch));
            } else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String temp = "(" + op1 + ch + op2 +")";
                stack.push(temp);
            }
        }
        return stack.peek();
    }
}
