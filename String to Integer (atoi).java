class Solution {
    public int myAtoi(String str) {
        
        if(str==null || str.isEmpty())
            return 0;
        
        int n=str.length();
        int i=0;
        int sign=1;
        while(i<n){
            if(str.charAt(i)==' ')
                i++;
            else
                break;
        }
        
        if(i>=n || (!Character.isDigit(str.charAt(i)) && str.charAt(i)!='+' && str.charAt(i)!='-'))
            return 0;
        
        if(str.charAt(i)=='+'){
            i++;
        }
        else if(str.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        
        long result=0;
        
        while(i<n && Character.isDigit(str.charAt(i))){
            
            result=(result*10) + str.charAt(i) -'0';
             if(result*sign>Integer.MAX_VALUE)  
            return Integer.MAX_VALUE;
        
       else if(result*sign<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
            i++;
            
        }
        
       
        
        return (int)result*sign;
        
    }
}