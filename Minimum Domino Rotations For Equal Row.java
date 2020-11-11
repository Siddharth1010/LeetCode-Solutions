class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        
        int minvalue=Math.min(minswap(A[0],A,B),minswap(B[0],A,B));
        
        minvalue=Math.min(minvalue,minswap(A[0],B,A));
        minvalue=Math.min(minvalue,minswap(B[0],B,A));
        
        return minvalue==Integer.MAX_VALUE? -1 : minvalue;
        
        
        
    }
    
    public static int minswap(int target,int a[],int b[]){
        
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=target && b[i]!=target)
                return Integer.MAX_VALUE;
            else if(a[i]!=target)
                count++;
            
            
        }
        
        return count;
    }
    
}