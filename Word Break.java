//METHOD 1: DYNAMIC PROGRAMMING
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        boolean dp[]=new boolean[s.length()+1];
        
        dp[0]=true;
        
        for(int len=1;len<=s.length();len++){
            for(int i=0;i<len;i++)
                if(dp[i]==true && wordDict.contains(s.substring(i,len))){
                    dp[len]=true;
                    break;
                }
        }
        
        return dp[s.length()];
        
    }
}


//METHOD 2: RECURSION AND MEMOIZATION

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        if(s.length()==0)
            return true;
        
        HashSet<String> set=new HashSet<String>();
        HashMap<String,Boolean> map=new HashMap<>();

        
        for(String s1:wordDict){
            set.add(s1);
        }
        
        
        return find(s,set,0,map);
        
    }
    
    public boolean find(String s, HashSet<String> words,int size,HashMap<String,Boolean> map){
        
        size=s.length();
        if(size==0)
            return true;
        
        if(map.containsKey(s))
            return map.get(s);
        
        for(int i=1;i<=s.length();i++){
            if(words.contains(s.substring(0,i)) && find(s.substring(i,size),words,size,map))
            {
                map.put(s.substring(i,s.length()),true);
                return true;
            }
                                
        }
        
        map.put(s,false);
        
        return false;
    }
}