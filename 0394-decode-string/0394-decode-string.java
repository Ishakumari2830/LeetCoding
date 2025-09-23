class Solution {
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<String> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();


        int num = 0; // to build multi-digit numbers

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0'); 
            } else if (c == '[') {
                st2.push(num); 
                num = 0;       
                st1.push("["); 
            } else if (c == ']') {
                sb.setLength(0);
                while (!st1.peek().equals("[")) {
                    sb.insert(0, st1.pop()); 
                }
                st1.pop();
                int repeat = st2.pop();
                String repeated = sb.toString().repeat(repeat);
                st1.push(repeated); 
            } else {
                st1.push(String.valueOf(c));
            }
        }

        // Build final result
        sb.setLength(0);
        while (!st1.isEmpty()) {
            sb.insert(0, st1.pop());
        }

        return sb.toString();
    }
}