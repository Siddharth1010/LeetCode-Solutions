class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> list=new ArrayList();
        HashMap<String,List<String>> map=new HashMap();
        
        for(int i=0;i<strs.length;i++){
            char a[]=strs[i].toCharArray();
            Arrays.sort(a);
            String sorted=new String(a);
            
            if(!map.containsKey(sorted))
            map.put(sorted,new ArrayList());
            
            // else{
            //     List<String> temp=new ArrayList();
            //     temp.add(strs[i]);
            //     map.put(sorted,new ArrayList(temp));
            // }
                
             map.get(sorted).add(strs[i]);
        }
        
        list.addAll(map.values());
        return list;
        
    }
}