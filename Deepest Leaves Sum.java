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
    public int deepestLeavesSum(TreeNode root) {
        
        //List<Integer> sol=new ArrayList<>();
        
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        int sum=0;
        
        if(root==null)
            return 0;
        
        q.add(root);
        
        while(!q.isEmpty()){
            
            list.clear();
            
            int cursize=q.size();
            
            for(int i=0;i<cursize;i++){
                
                TreeNode temp=q.remove();
                list.add(temp.val);
                
                if(temp.left!=null)
                    q.add(temp.left);
                
                if(temp.right!=null)
                    q.add(temp.right);
            }
            
        }
        
        
        for(int i:list)
            sum+=i;
        
        return sum;
        
    }
}