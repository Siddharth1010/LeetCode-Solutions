class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new LinkedList<>();
        List<Integer> current=new LinkedList<>();
        generate(0,nums,current,list);
        return list;
    }
    
    public void generate(int index,int[] nums,List<Integer> current,List<List<Integer>> list){
        
        
        list.add(new LinkedList<>(current));
        
        for(int i=index;i<nums.length;i++){
            current.add(nums[i]);
            generate(i+1,nums,current,list);
            current.remove(current.size()-1);
        }
    }
}