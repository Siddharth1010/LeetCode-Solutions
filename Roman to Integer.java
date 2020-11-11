class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        if(s.length()==0)
            return 0;
        
        if(s.length()==1)
            return map.get(s.charAt(0));
        
        int conv=0;
                
        for(int i=0;i<s.length()-1;i++){
            if(map.get(s.charAt(i)) >=map.get(s.charAt(i+1)))
                conv+=map.get(s.charAt(i));
            else{
                conv-=map.get(s.charAt(i));
            }
            
            
        }
        conv+=map.get(s.charAt(s.length()-1));
        
        return conv;
        
    }
}