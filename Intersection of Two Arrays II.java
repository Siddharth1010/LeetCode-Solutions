class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        for(int i : nums1){
            
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(int i : nums2){
            
            if(map.containsKey(i) && map.get(i)>0){
                list.add(i);
                map.put(i,map.get(i)-1);
                
            }
        }
        
        int a[]=new int[list.size()];
        int index=0;    
        for(int i :list){
            
            a[index++]=i;
        }
        
        return a;
    }
}