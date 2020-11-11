class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0)
            return 0;
        
        int count=0;
        
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                count+=calc(grid,i,j);
                }
            }
    return count;    
    }
    
    public int calc(char[][] grid,int i,int j){
        
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0')
            return 0;
        
        grid[i][j]='0';
        calc(grid,i-1,j);
        calc(grid,i+1,j);
        calc(grid,i,j-1);
        calc(grid,i,j+1);
        return 1;
    }
    
}