class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int a[]=new int[2];
        for(int i=0;i<nums.length;i++){
            
            if(map.containsKey(target-nums[i]))
            {
        
                a[0]=i;
                a[1]=map.get(target-nums[i]);
                Arrays.sort(a);
                return a;
            }
            else{
                map.put(nums[i],i);
            }
                
        }
        
        return a;
        
    }
}