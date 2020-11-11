class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set=new HashSet<String>();
        
        for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            
            char value=board[i][j];
            
            if(value!='.'){
                if(!set.add(value+"found in row"+i) || !set.add(value+"found in column"+j) || !set.add(value+"found in sub box"+i/3+"-"+j/3))
                    return false;
            }
            
            
        }
        }
        
        return true;
        
    }
}