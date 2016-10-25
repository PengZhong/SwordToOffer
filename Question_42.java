
public class Question_42 {
	// 输入一棵二叉树，判断该二叉树是否是平衡二叉树
	private boolean isBalanced = true;
	
	public boolean IsBalanced_Solution(TreeNode root) {
		// 后续遍历时，遍历到一个节点，其左右子节点已经遍历过
		// 一次自底向上判断，每个节点只需要遍历一次
		if (root == null)
			return true;
		getDepth(root);
		return isBalanced;
	}
	
	public int getDepth(TreeNode root) {
		if (root == null)
			return 0;
		int left = getDepth(root.left);
		int right = getDepth(root.right);
		if (Math.abs(left - right) > 1)
			isBalanced = false;
		return right > left ? right + 1 : left + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
