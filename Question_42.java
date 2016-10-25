
public class Question_42 {
	// ����һ�ö��������жϸö������Ƿ���ƽ�������
	private boolean isBalanced = true;
	
	public boolean IsBalanced_Solution(TreeNode root) {
		// ��������ʱ��������һ���ڵ㣬�������ӽڵ��Ѿ�������
		// һ���Ե������жϣ�ÿ���ڵ�ֻ��Ҫ����һ��
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
