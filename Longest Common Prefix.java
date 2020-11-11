class Solution {
    public String longestCommonPrefix(String[] strs) {
        
//         String prefix=new String("");
        
//         if(strs==null || strs.length==0)
//             return prefix;
        
//         for(int i=0;i<strs[0].length();i++){
//             for(int j=1;j<strs.length;j++){
                
//                 if( i>=strs[j].length() || strs[0].charAt(i)!=strs[j].charAt(i))
//                     return prefix;
            
//             }
            
//             prefix+=strs[0].charAt(i);
//         }
        
//         return prefix;
        
        
         if(strs==null || strs.length==0)
            return "";
        
        String prefix=new String(strs[0]);
        
       
        

            
            for(int j=1;j<strs.length;j++){
                while(strs[j].indexOf(prefix)!=0){
                    prefix=prefix.substring(0,prefix.length()-1);
                }
            }
        
        
        return prefix;
        
    }
}