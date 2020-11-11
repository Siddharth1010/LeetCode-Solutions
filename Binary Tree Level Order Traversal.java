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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> list=new ArrayList();
        
        Queue<TreeNode> q=new LinkedList<>();
        
        if(root==null)
            return list;
        
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> level=new ArrayList();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode current=q.remove();
                level.add(current.val);
                if(current.left!=null){
                    q.add(current.left);
                }
                if(current.right!=null){
                    q.add(current.right);
                }
            }
            
            list.add(level);
            
            
        }
        
        return list;
        
        
    }
}