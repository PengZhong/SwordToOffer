import java.util.Arrays;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class Question_6 {
	// 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
	// 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
	// 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
	// 则重建二叉树并返回。

	public static TreeNode solution(int[] pre, int[] in) {
		if (pre == null || in == null || pre.length <= 0) {
			return null;
		}
		TreeNode root = new TreeNode(pre[0]);
		int i = 0;
		for (i = 0; i < in.length; i++) {
			if (in[i] == pre[0])
				break;
		}
		
		int[] left_pre = Arrays.copyOfRange(pre, 1, i + 1);
		int[] left_in = Arrays.copyOfRange(in, 0, i);
		int[] right_pre = Arrays.copyOfRange(pre, i + 1, pre.length);
		int[] right_in = Arrays.copyOfRange(in, i + 1, in.length);

		root.left = solution(left_pre, left_in);
		root.right = solution(right_pre, right_in);
		return root;
	}

	public static void post_order(TreeNode node) {
		if (node != null) {
			post_order(node.left);
			post_order(node.right);
			System.out.print(node.val + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pre = { 1, 2, 4, 7, 3, 5, 6, 8 };
		int[] in = { 4, 7, 2, 1, 5, 3, 8, 6 };
		TreeNode root = solution(pre, in);
		post_order(root);
	}

}
