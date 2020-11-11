class Solution {
    public int nums1[];
    public int nums2[];

    public Solution(int[] nums) {
         nums1=Arrays.copyOf(nums, nums.length);
        nums2=nums;
        for(int i=0;i<nums1.length;i++)
        System.out.print(nums1[i]);
        System.out.println();
        
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
//         for(int i=0;i<nums1.length;i++)
//         System.out.print(nums1[i]);
//         System.out.println();
        
//         for(int i=0;i<nums2.length;i++)
//         System.out.print(nums2[i]);
        
        nums1=Arrays.copyOf(nums2, nums2.length);
        return nums1;
        
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        
        int n=nums1.length;
        
        for(int i=0;i<n;i++){
            
            int r=i+(int)(Math.random()*(n-i));
            int temp=nums1[i];
            nums1[i]=nums1[r];
            nums1[r]=temp;
        }
        
        return nums1;
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */