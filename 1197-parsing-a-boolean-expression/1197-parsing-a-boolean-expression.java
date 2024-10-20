class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> st = new Stack<>();
        for(char c : expression.toCharArray()){
            if(c == ',' || c == '(') continue;
            if(c == 't' || c == 'f' || c == '&' || c == '!'|| c == '|'){
                st.push(c);
            }
            if(c == ')'){
                boolean tflag = false, fflag = false;
            
        
        while(st.peek() != '|' && st.peek() != '&' && st.peek() != '!'){
            char top = st.pop();
            if(top == 't')tflag = true;
            else
             fflag = true;
        }

            char ex = st.pop();
            if(ex == '!'){
               st.push( tflag ? 'f' : 't');
            }
            else if(ex == '&'){
               st.push( fflag ? 'f' : 't');
            }
            else if(ex == '|'){
               st.push( tflag ? 't' : 'f');
            }

        }
            }
        return st.peek()=='t';
    }
}