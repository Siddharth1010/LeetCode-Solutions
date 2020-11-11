/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
       
        
        int i=1;
        int result=-1;
        while(i<=n){
            int mid=i+(n-i)/2;
            
            if(isBadVersion(mid)==true){
                result=mid;
                n=mid-1;
            }
            
            if(isBadVersion(mid)==false){
                i=mid+1;
            }
        }
        
        return result;
        
    }
}