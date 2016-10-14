
class BTreeNode {
    int val = 0;
    BTreeNode left = null;
    BTreeNode right = null;

    public BTreeNode(int val) {
        this.val = val;
    }
}

public class Question_21 {
	
	// 操作给定的二叉树，将其变换为源二叉树的镜像
	
	public static void Mirror(BTreeNode root) {
		if (root == null)
            return;
        if (root.left == null && root.right == null)
            return;
        BTreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        if (root.left != null)
            Mirror(root.left);
        if (root.right != null)
            Mirror(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
