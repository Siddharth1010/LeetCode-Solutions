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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> sol=new ArrayList<>();
        
        Queue<TreeNode> q=new LinkedList<>();
        
        if(root==null)
            return sol;
        
        q.add(root);
        
        while(!q.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int cursize=q.size();
            
            for(int i=0;i<cursize;i++){
                
                TreeNode temp=q.remove();
                list.add(temp.val);
                
                if(temp.left!=null)
                    q.add(temp.left);
                
                if(temp.right!=null)
                    q.add(temp.right);
            }
            
            sol.add(list);
        }
        
        Collections.reverse(sol);
        
        return sol;
        
    }
}