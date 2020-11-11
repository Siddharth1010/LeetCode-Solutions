class Solution {
    public int strStr(String haystack, String needle) {
        
      if(needle==null || needle.isEmpty())
          return 0;
        
        int h=haystack.length();
        int n=needle.length();
        int i=0,j=0;
        
        for( i=0;i<h && j<n;i++){
            
            char val1=haystack.charAt(i);
            char val2=needle.charAt(j);
            
            if(val1==val2){
                j++;
            }
            
            else{
                i-=j;
                j=0;
            }
        }
        return j==n? i-j : -1;
    }
}