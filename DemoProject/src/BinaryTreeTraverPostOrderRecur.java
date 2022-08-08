public class BinaryTreeTraverPostOrderRecur {

    TreeNode root;

    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void creatTree() {
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

    public void traverseTree(TreeNode root) {
        if (root == null) {
            return;
        }
        traverseTree(root.left);
        traverseTree(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        BinaryTreeTraverPostOrderRecur obj = new BinaryTreeTraverPostOrderRecur();
        obj.creatTree();
        obj.traverseTree(obj.root);
    }
}
