class Solution {
    public void setZeroes(int[][] matrix) {
        
        int m=matrix.length;
        int n=matrix[0].length;
        System.out.println(m+" "+n);
        
        for(int i=0;i<m;i++)
        for(int j=0;j<n;j++){
            
            if(matrix[i][j]==0){
                for(int k=0;k<n;k++)
                    if(matrix[i][k]!=0)
                    matrix[i][k]=Integer.MAX_VALUE-1;
                
                for(int k=0;k<m;k++)
                    if(matrix[k][j]!=0)
                    matrix[k][j]=Integer.MAX_VALUE-1;
                    
            }
        }
        
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                if(matrix[i][j]==Integer.MAX_VALUE-1)
                    matrix[i][j]=0;
        
    }
}