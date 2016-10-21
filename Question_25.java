import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class BiTreeNode {
	int val = 0;
	BiTreeNode left = null;
	BiTreeNode right = null;

	public BiTreeNode(int val) {
		this.val = val;

	}

}

public class Question_25 {
	// 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
	public ArrayList<Integer> PrintFromTopToBottom(BiTreeNode root) {
		// 实际就是二叉树的层序遍历
		if (root == null)
			return null;
		ArrayList<Integer> result = new ArrayList<Integer>();
		Queue<BiTreeNode> queue = new LinkedList<BiTreeNode>();
		queue.offer(root);
		BiTreeNode tmp = null;
		while (!queue.isEmpty()) {
			tmp = queue.poll();
			result.add(tmp.val);
			if (tmp.left != null)
				queue.offer(tmp.left);
			if (tmp.right != null)
				queue.offer(tmp.right);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
