class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new LinkedList<>();
        if(n==0)
            return list;
        
        backtrack(list,"",0,0,n);
        return list;
        
    }
    
    public void backtrack(List<String> list,String comb,int open,int closed,int max){
        
        if(comb.length()==max*2){
            list.add(comb);
            return;
            
        }
        else{
            if(open<max)
                backtrack(list,comb+"(",open+1,closed,max);
            if(closed<open)
                backtrack(list,comb+")",open,closed+1,max);
            
            
        }
    }
}