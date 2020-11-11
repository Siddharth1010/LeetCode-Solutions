class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> list=new ArrayList(); 
        
        List<Integer> a=new ArrayList();
        a.add(1);
        List<Integer> b=new ArrayList();
        b.add(1);
        b.add(1);
        if(numRows==0)
            return list;
        list.add(0,new ArrayList(a));
        if(numRows==1)
            return list;
        a.clear();
        a.add(1);
        a.add(1);
        list.add(1,new ArrayList(a));
        if(numRows==2)
            return list;
        
        for(int i=2;i<numRows;i++){
            List<Integer> temp1=new ArrayList();
            temp1=list.get(i-1);
            int n=temp1.size();
            System.out.println(n);
            List<Integer> temp2=new ArrayList();
            for(int j=0;j<n+1;j++){
                if(j==0 || j==n)
                    temp2.add(j,1);
                else{
                    int val=temp1.get(j-1)+temp1.get(j);
                    temp2.add(j,val);
                }
            }
            System.out.println(temp2);
            list.add(temp2);
            
            
        }
        
        
        
        
        return list;
        
    }
}