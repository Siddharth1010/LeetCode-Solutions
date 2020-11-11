class Solution {
    public int countPrimes(int n) {
        
        boolean primes[]=new boolean[n];
        
        for(int i=0;i<n;i++)
            primes[i]=true;
        
        for(int i=2;i*i<primes.length;i++){
            if(primes[i]==true){
                for(int j=2;j*i<primes.length;j++)
                    primes[i*j]=false;
            }
        }
        
        int count =0;
        
        for(int i=2;i<primes.length;i++)
            if(primes[i])
                count++;
        
        
        return count;
        
        
    }
}