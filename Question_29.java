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
	// 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
	// 要求不能创建任何新的结点，只能调整树中结点指针的指向。
	public static TreeNode Convert(TreeNode root) {
		// 核心是中序遍历的非递归算法。
		// 修改当前遍历节点与前一遍历节点的指针指向。
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
					pre.right = pointer; // 右子树指针代表后继指针
					pointer.left = pre; // 左子树指针代表前驱指针
					pre = pointer;
				}
				pointer = pointer.right;
			}
		}
		return root;
	}

	public static TreeNode ConvertWithRecursion(TreeNode root) {
		// 将左子树构造成双链表，并返回链表头节点。
		// 定位至左子树双链表最后一个节点。
		// 如果左子树链表不为空的话，将当前root追加到左子树链表。
		// 将右子树构造成双链表，并返回链表头节点。
		// 如果右子树链表不为空的话，将该链表追加到root节点之后。
		// 根据左子树链表是否为空确定返回的节点。
		if (root == null)
			return null;
		if (root.left == null && root.right == null)
			return root;
		// 1.将左子树构造成双链表，并返回链表头结点
		TreeNode left = Convert(root.left);
		TreeNode p = left;
		// 2.定位至左子树双链表最后一个节点。
		while (p != null && p.right != null) {
			p = p.right;
		}
		// 3.如果左子树链表不为空的话，将当前root追加到左子树链表
		if (left != null) {
			p.right = root;
			root.left = p;
		}
		// 4.将右子树构成双链表，并返回链表头结点
		TreeNode right = Convert(root.right);
		// 5.如果右子树链表不为空的话，将该链表追加到root结点之后
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
