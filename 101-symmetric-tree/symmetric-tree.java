class Solution {
    public boolean isSymmetric(TreeNode root) {
        return traverse(root, root);
    }

    private boolean traverse(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null) return true;

        if(root1 == null || root2 == null || root1.val != root2.val) return false;

        return traverse(root1.left, root2.right) &&
               traverse(root1.right, root2.left);
    }
}