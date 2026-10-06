class Solution {
    public int minAddToMakeValid(String s) {
       Stack<Character> stack = new Stack<>();
        int cls= 0;

        
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
               
                stack.push(ch);
            } else if (ch == ')') {
                
                if (!stack.isEmpty()) {
                    stack.pop(); 
                } else {
                    cls++; 
                }
            }
        }

        
        int open = stack.size();
        
      
        return cls + open;
    }
}