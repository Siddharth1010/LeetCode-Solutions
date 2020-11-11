/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<TreeNode> q=new LinkedList<TreeNode>();
        List<List<Integer>> list=new LinkedList<>();
        
        if(root==null)
            return list;
        
        int count;
        int c=0;
        TreeNode cur=root;
        q.add(cur);
        
        while(!q.isEmpty()){
            c=c+1;
            if(c%2!=0)
                count=0;
            else
                count=1;
            int n=q.size();
            List<Integer> l1=new LinkedList<>();
            
            for(int i=n-1;i>=0;i--){
                TreeNode temp=q.get(i);
                System.out.println(count);
                q.remove(i);
                if(count==1){
                if(temp.right!=null)
                    q.add(temp.right);
                if(temp.left!=null)
                    q.add(temp.left);
                    
                // count=0;
                }
                else if(count==0){
                    if(temp.left!=null)
                        q.add(temp.left);
                    if(temp.right!=null)
                        q.add(temp.right);
                    
                    // count=1;
                }
                
                l1.add(temp.val);
            }
            
            list.add(l1);
            
        }
        
        return list;
        
    }
}