public class IntTree {
    TreeNode<Integer> overallRoot;
    public IntTree() {
        overallRoot = null;
    }
    public void preOrder() {
        System.out.println("Preorder: ");
        preOrder(overallRoot);
        System.out.println();
    }
    public void preOrder (TreeNode<Integer> root) {
        if (root != null) {
            System.out.println(" " + root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}
