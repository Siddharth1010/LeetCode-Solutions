class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty())
            return true;
        int n=s.length();
        
        // int i=0,j=n-1;
        
    for(int i=0,j=n-1;i<j;i++,j--){
        // char value1=s.charAt(i);
        // char value2=s.charAt(j);
        
        while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
            i++;
        }
        
        while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
            j--;
        }
        
        if(i<j && Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))
            return false;
        // else{
        //     i++;
        //     j--;
        // }
        
    }        
        
        return true;
    }
}