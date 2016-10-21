import java.util.Stack;

//class TreeNode {
//	int val = 0;
//	TreeNode left = null;
//	TreeNode right = null;
//
//	public TreeNode(int val) {
//		this.val = val;
//
//	}
//
//}

public class Question_29 {
	// ����һ�ö��������������ö���������ת����һ�������˫������
	// Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
	public static TreeNode Convert(TreeNode root) {
		// ��������������ķǵݹ��㷨��
		// �޸ĵ�ǰ�����ڵ���ǰһ�����ڵ��ָ��ָ��
		if (root == null)
			return null;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode pointer = root;
		TreeNode pre = null;
		boolean isFirst = true;
		while (!stack.isEmpty() || pointer != null) {
			if (pointer != null) {
				stack.push(pointer);
				pointer = pointer.left;
			} else {
				pointer = stack.pop();
				if (isFirst) {
					root = pointer;
					pre = root;
					isFirst = false;
				} else {
					pre.right = pointer; // ������ָ�������ָ��
					pointer.left = pre; // ������ָ�����ǰ��ָ��
					pre = pointer;
				}
				pointer = pointer.right;
			}
		}
		return root;
	}

	public static TreeNode ConvertWithRecursion(TreeNode root) {
		// �������������˫��������������ͷ�ڵ㡣
		// ��λ��������˫�������һ���ڵ㡣
		// �������������Ϊ�յĻ�������ǰroot׷�ӵ�����������
		// �������������˫��������������ͷ�ڵ㡣
		// �������������Ϊ�յĻ�����������׷�ӵ�root�ڵ�֮��
		// ���������������Ƿ�Ϊ��ȷ�����صĽڵ㡣
		if (root == null)
			return null;
		if (root.left == null && root.right == null)
			return root;
		// 1.�������������˫��������������ͷ���
		TreeNode left = Convert(root.left);
		TreeNode p = left;
		// 2.��λ��������˫�������һ���ڵ㡣
		while (p != null && p.right != null) {
			p = p.right;
		}
		// 3.�������������Ϊ�յĻ�������ǰroot׷�ӵ�����������
		if (left != null) {
			p.right = root;
			root.left = p;
		}
		// 4.������������˫��������������ͷ���
		TreeNode right = Convert(root.right);
		// 5.�������������Ϊ�յĻ�����������׷�ӵ�root���֮��
		if (right != null) {
			right.left = root;
			root.left = right;
		}
		return left != null ? left : root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
