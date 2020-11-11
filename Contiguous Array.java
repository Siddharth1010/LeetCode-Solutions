class Solution {
    public int findMaxLength(int[] nums) {
        
        for(int i=0;i<nums.length;i++)
            if(nums[i]==0)
                nums[i]=-1;
        
        
        int maxlen=0,sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            
            sum+=nums[i];
            
            if(sum==0){
                maxlen=i+1;
            }
            
            if(map.containsKey(sum)){
                int temp=map.get(sum);
                if(i-temp>maxlen)
                    maxlen=i-temp;
            }
            
            else{
                map.put(sum,i);
            }
        }
        
        return maxlen;
        
    }
}