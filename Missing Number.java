class Solution {
    public int missingNumber(int[] nums) {
        
        
        
        // for(int i=0;i<nums.length;i++)
        //     if(nums[i]>max)
        //         max=nums[i];
        int max=nums.length+1;
        System.out.println(max);
        
        int gauss=max*(max-1)/2;
        
         System.out.println(gauss);
        
        int sum=0;
        
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        
         System.out.println(sum);
        
        // if(sum==gauss)
        //     return -1;
        
        return gauss-sum;
        
    }
}