class Solution {
    public String countAndSay(int n) {
        
       if(n==1)
           return "1";
        String result="1";
        
        for(int i=2;i<=n;i++){
            
            StringBuilder s=new StringBuilder();
            int count=1;
            int j;
            for(j=1;j<result.length();j++){
                char prev=result.charAt(j-1);
                char ch=result.charAt(j);
                if(ch==prev){
                    count++;
                    
                }
                else{
                    s.append(count);
                    s.append(prev);
                    count=1;
                }
                
            }
            
            s.append(count);
            s.append(result.charAt(j-1));
            result=s.toString();
            
        }
        
        return result;
        
    }
}