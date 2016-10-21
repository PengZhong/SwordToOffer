import java.util.ArrayList;

public class Question_27 {
	// ����һ�Ŷ�������һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����
	// ·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
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
