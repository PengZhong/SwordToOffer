import java.util.ArrayList;

public class Question_27 {
	// 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
	// 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
	public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (root == null)
			return result;
		int sum = 0;
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		path(root, target, result, a1, sum);
		return result;
	}

	public static void path(TreeNode root, int target, ArrayList<ArrayList<Integer>> arr, ArrayList<Integer> a1,
			int sum) {
		if (root == null)
			return;
		sum += root.val;
		if (root.left == null && root.right == null) {
			if (sum == target) {
				a1.add(root.val);
				arr.add(new ArrayList<Integer>(a1));
				a1.remove(a1.size() - 1);
			}
			return;
		}
		a1.add(root.val);
		path(root.left, target, arr, a1, sum);
		path(root.right, target, arr, a1, sum);
		a1.remove(a1.size() - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
