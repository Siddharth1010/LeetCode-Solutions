class Solution {
    
     List<String> list=new LinkedList<>();
    HashMap<String,String> map=new HashMap<>(){{
    put("2", "abc");
    put("3", "def");
    put("4", "ghi");
    put("5", "jkl");
    put("6", "mno");
    put("7", "pqrs");
    put("8", "tuv");
    put("9", "wxyz");
        }};
    
    public List<String> letterCombinations(String digits) {
        
        
        if(digits.length()==0)
            return list;
        
         
        
        backtrack("",digits);
        return list;
    }
    
    public void backtrack(String comb,String nextdig){
        if(nextdig.length()==0){
            list.add(comb);
            return;
        }
        else{
            String digit=nextdig.substring(0,1);
            String mappings=map.get(digit);
            
            for(int i=0;i<mappings.length();i++){
                String letter=mappings.substring(i,i+1);
                backtrack(comb+letter,nextdig.substring(1));
            }
        }
        
    }
}