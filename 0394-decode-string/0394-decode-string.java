import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch != ']') {
                st.push(ch);
            } else {
                // Extract the substring inside brackets
                StringBuilder sb = new StringBuilder();
                while (!st.isEmpty() && st.peek() != '[') {
                    sb.append(st.pop());
                }
                
                // Remove '['
                st.pop();
                
                // Extract the number (it may be more than one digit)
                StringBuilder num = new StringBuilder();
                while (!st.isEmpty() && Character.isDigit(st.peek())) {
                    num.append(st.pop());
                }
                
                int repeatCount = Integer.parseInt(num.reverse().toString());
                
                // Reverse the decoded string and repeat it
                String decodedPart = sb.reverse().toString().repeat(repeatCount);
                
                // Push the repeated string back into the stack
                for (char c : decodedPart.toCharArray()) {
                    st.push(c);
                }
            }
        }
        
        // Construct the final result
        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.append(st.pop());
        }
        
        return result.reverse().toString();
    }
}
