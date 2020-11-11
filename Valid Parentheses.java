class Solution {
    public boolean isValid(String s) {
        
        if(s.length()==0)
            return true;
        
        if(s.length()==1)
            return false;
        
        
        
        Stack<Character> stack=new Stack<Character>();
        
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
                stack.push(s.charAt(i));
            
            else if(s.charAt(i)==')'){
                if(stack.empty())
                    return false;
                char c=stack.peek();
                if(c=='(')
                    stack.pop();
                else
                    stack.push(c);
            }
            else if(s.charAt(i)==']'){
                if(stack.empty())
                    return false;
                char c=stack.peek();
                if(c=='[')
                    stack.pop();
                else
                    stack.push(c);
            }
            
            else if(s.charAt(i)=='}'){
                if(stack.empty())
                    return false;
                char c=stack.peek();
                if(c=='{')
                    stack.pop();
                else
                    stack.push(c);
            }
        }
        
        if(!stack.empty())
            return false;
        
        return true;
        
    }
}