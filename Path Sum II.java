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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        
        List<List<Integer>> paths=new LinkedList<>();
        List<Integer> list=new LinkedList<>();
        
        if(root==null)
            return paths;
        
        dfs(root,sum,list,paths);
        
        return paths;
        
    }
    
    public void dfs(TreeNode root,int sum, List<Integer> list, List<List<Integer>> paths){
        
        if(root==null)
            return;
        
        list.add(root.val);
        
        if(root.val==sum && root.left==null && root.right==null){
            paths.add(list);
            return;
        }
        
        dfs(root.left,sum-root.val,new LinkedList<Integer>(list),paths);
        dfs(root.right,sum-root.val,new LinkedList<Integer>(list),paths);
    }
}