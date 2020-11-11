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
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> paths=new LinkedList<>();
        if(root==null)
            return paths;
        
        dfs(root,"",paths);
        return paths;
        
    }
    
    public static void dfs(TreeNode root,String cur,List<String> paths){
        
        cur+=root.val;
        
        if(root.left==null && root.right==null)
        {
            paths.add(cur);
            return;
        }
        
        if(root.left!=null){
            
            dfs(root.left,cur+"->",paths);
        }
        
        if(root.right!=null){
            
            dfs(root.right,cur+"->",paths);
        }
        
    }
}