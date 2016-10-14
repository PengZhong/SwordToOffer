
class BinaryTreeNode {
	int val = 0;
	BinaryTreeNode left = null;
	BinaryTreeNode right = null;

	public BinaryTreeNode(int val) {
		this.val = val;

	}

}

public class Question_20 {
	// �������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��

	public boolean HasSubtree(BinaryTreeNode root1, BinaryTreeNode root2) {
		boolean result = false;
		if (root1 != null && root2 != null) {
			if (root1.val == root2.val)
				result = DoesTree1HasTree2(root1, root2);
			if (!result)
				result = HasSubtree(root1.left, root2);
			if (!result)
				result = HasSubtree(root1.right, root2);
		}
		return result;
	}

	public boolean DoesTree1HasTree2(BinaryTreeNode root1, BinaryTreeNode root2) {
		if (root2 == null)
			return true;
		if (root1 == null)
			return false;
		if (root1.val != root2.val)
			return false;
		return DoesTree1HasTree2(root1.left, root2.left) && DoesTree1HasTree2(root1.right, root2.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
