class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hash=new HashSet<>();
        int sum=0;
        while(sum!=1){
            sum=0;
        while(n!=0){
            int a=n%10;
           sum+=a*a; 
           n=n/10; 
        }
        if(hash.contains(sum))
            return false;
        else
            hash.add(sum);
        n=sum;
        }
        
        return true;
        
    }
}