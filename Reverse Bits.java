public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        
        int i=0;
        int result=0;
        while(i<32){
      result=result<<1;
            result+=n%2;
              
            n=n>>>1;
            i++;
            
        }
        
        return result;
        
    }
}