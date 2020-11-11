class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new LinkedList<>();
        List<Integer> perm=new LinkedList<>();
        boolean[] used=new boolean[nums.length];
        
        generate(nums,perm,list,used);
        return list;
        
    }
    
    public void generate(int[] nums,List<Integer> perm,List<List<Integer>> list,boolean[] used){
        if(perm.size()==nums.length){
            list.add(new LinkedList<>(perm));
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(used[i]==true)
                    continue;
                else{
                    used[i]=true;
                    perm.add(nums[i]);
                    generate(nums,perm,list,used);
                    perm.remove(perm.size()-1);
                    used[i]=false;
                }
            }
        }
    }
}