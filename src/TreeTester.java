public class TreeTester {
    public static void main(String[] args) {
        IntTree t = new IntTree();
        t.overallRoot = new TreeNode<Integer>(1);
        t.overallRoot.left = new TreeNode<Integer>(2);
        t.overallRoot.right = new TreeNode<Integer>(3);
        t.overallRoot.left.left = new TreeNode<Integer>(4);
        t.overallRoot.left.right = new TreeNode<Integer>(5);
        t.preOrder();
    }
}
