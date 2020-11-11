class Solution {
    public boolean canPartition(int[] nums) {
        
        int total=0;
        
        for(int i=0;i<nums.length;i++)
            total+=nums[i];
        
        if(total%2!=0)
            return false;
        
        return recursive(nums,0,0,total,new HashMap<String,Boolean>());
        
    }
    
    public boolean recursive(int[] nums, int index, int sum,int total,HashMap<String,Boolean> seen){
        
        String cur=index+""+sum;
        
        if(seen.containsKey(cur))
            return seen.get(cur);
        
        if(sum*2==total)
            return true;
        
        if(sum>total/2 || index>=nums.length)
            return false;
        
        boolean found=recursive(nums,index+1,sum,total,seen) || recursive(nums,index+1,sum+nums[index],total,seen);
        
        seen.put(cur,found);
        return found; 
    }
}