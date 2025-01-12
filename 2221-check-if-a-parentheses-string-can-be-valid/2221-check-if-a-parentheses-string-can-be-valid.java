class Solution {
    public boolean canBeValid(String s, String locked) {
     int len = s.length();
     if(len % 2 == 1)return false;
     Stack<Integer> opnBrkt = new Stack<>();
     Stack<Integer> unlock = new Stack<>();

     for(int i = 0;i<len;i++){
        if(locked.charAt(i)=='0'){
            unlock.push(i);
        }
        else if(s.charAt(i)=='('){
            opnBrkt.push(i);
        } 
        else if(s.charAt(i)==')'){
            if(!opnBrkt.empty()){
                opnBrkt.pop();
            } else if(!unlock.empty()){
                unlock.pop();
            }
            else return false;
        }

     }
     while(!opnBrkt.empty() && !unlock.empty() && opnBrkt.peek() < unlock.peek()){
        opnBrkt.pop();
        unlock.pop();
     }
     if(!opnBrkt.empty())return false;
     return true;
    }
}