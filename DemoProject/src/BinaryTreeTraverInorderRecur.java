public class BinaryTreeTraverInorderRecur {
    private TreeNode root;

    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void createTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
    }

    public void display(TreeNode root) {
        if (root == null) {
            return;
        }
        display(root.left);
        System.out.print(root.data + " ");
        display(root.right);
    }

    public static void main(String[] args) {
        BinaryTreeTraverInorderRecur obj = new BinaryTreeTraverInorderRecur();
        obj.createTree();
        obj.display(obj.root);
    }
}
