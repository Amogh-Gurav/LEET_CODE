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
        Queue<TreeNode> q =new ArrayDeque<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        q.offer(root);

        while(!q.isEmpty()){
            int s=q.size();
            List<Integer> temp=new ArrayList<>();

            for(int i=0;i<s;i++){
                TreeNode n=q.poll();
                temp.add(n.val);

                if(n.left!=null){
                    q.offer(n.left);
                }
                if(n.right!=null){
                    q.offer(n.right);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}