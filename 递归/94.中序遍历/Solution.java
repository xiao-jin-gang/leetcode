 public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}








// 中序遍历 [1,null,2,3]
// 用到递归
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        dfs(list,root);
        return list;
    }
    void dfs(List<Integer> list, TreeNode root) {
        if (root == null)
            return;
        dfs(list,root.left);    // 遍历左子树递归
        list.add(root.val);     // 中序输出
        dfs(list,root.right);   // 遍历右子树递归
       }