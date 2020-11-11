class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        if(nums.length==0)
            return false;
        
        int min=Integer.MAX_VALUE,b=Integer.MAX_VALUE;
        
        for(int i : nums){
            if(min>=i){
                min=i;
            }
            else if(b>=i){
                b=i;
            }
            else
                return true;
        }
        
        return false;
        
    }
}