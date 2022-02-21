class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        char[] charArray = s.toCharArray();
        for(int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '(' || charArray[i] == '[' || charArray[i] =='{' ) {
                stack.push(charArray[i]);
            }
            else {
                // 出栈判断是否相等
                if (!stack.empty()) {
                    if (charArray[i] == '}') {
                        if (stack.pop() != '{')
                            return false;
                    }else if (charArray[i] == ']'){
                        if (stack.pop() != '[')
                            return false;
                    }else {
                        if (stack.pop() != '(')
                            return false;
                    }
                }
                else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}