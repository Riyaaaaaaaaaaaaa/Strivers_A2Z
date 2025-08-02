class Solution {
    public String infixToPostfix(String s) {
        // Your code goes here
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for(char ch : s.toCharArray()) {
            if(Character.isLetterOrDigit(ch)) {
                result.append(ch);
            } else if(ch == '(') {
                stack.push(ch);
            } else if(ch == ')') {
                while(!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            } else {
                while(!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
    private int precedence(char op) {
    if(op == '+' || op == '-') return 1;
    if(op == '*' || op == '/') return 2;
    if(op == '^') return 3;
    return 0;
}

}
