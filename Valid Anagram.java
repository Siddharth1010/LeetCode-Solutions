class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        
        for(int i=0;i<s.length();i++){
            char value=s.charAt(i);
            map.put(value,map.getOrDefault(value,0)+1);
        }
        
        for(int i=0;i<t.length();i++){
            
            char value=t.charAt(i);
            if(map.containsKey(value)){
               map.put(value,map.get(value)-1);
            }
            else{
                map.put(value,map.getOrDefault(value,0)+1);
            }
        }
        
        
        for(char c: map.keySet()){
            if(map.get(c)>0)
                return false;
        }
            
        return true;
    }
}