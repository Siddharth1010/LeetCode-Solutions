class Solution {
    public int maxSubArray(int[] nums) {
        
        if(nums.length==0 || nums==null)
            return -1;
        
        int cursum=nums[0];
        int maxsum=nums[0];
        
        for(int i=1;i<nums.length;i++){
             cursum=Math.max(cursum+nums[i],nums[i]);
            
            if(cursum>maxsum)
                maxsum=cursum;
            
        }
        
        return maxsum;
        
    }
}