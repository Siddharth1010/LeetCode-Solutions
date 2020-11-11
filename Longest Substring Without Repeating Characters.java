class Solution {
    public int lengthOfLongestSubstring(String s) {
        
// for(int i=0;i<s.length()-1;i++){
//             set.clear();
//             int count=1;
//             char c=s.charAt(i);
//             set.add(c);
//             for(int j=i+1;j<s.length();j++){
//                 if(set.contains(s.charAt(j)))
//                     break;
//                 else{
//                     set.add(s.charAt(j));
//                     count++;
//                     System.out.println(s.charAt(j));
//                     if(max<count)
//                         max=count;
//                 }
//             }
//         }
        
        if(s.length()==0)
            return 0;
        
        
        int max=0;
        HashSet<Character> set=new HashSet();
        int i=0;
        int j=0;
        
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                max=Math.max(set.size(),max);
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        
        return max;
        
    }
}