class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int start=0;
        int end=1;
        int curcost=gas[0]-cost[0];
        int n=gas.length;
        
        if(n==1){
            if(gas[0]-cost[0] >= 0)
                return 0;
            else
                return -1;
        }
        
        while(end!=start || curcost<0){
            
            while(curcost<0 && start!=end){
                curcost-=gas[start]-cost[start];
                start=(start+1)%n;
                
                if(start==0)
                    return -1;
            }
            
            curcost+=gas[end]-cost[end];
            end=(end+1)%n;
        }
        
        return start;
        
    }
}