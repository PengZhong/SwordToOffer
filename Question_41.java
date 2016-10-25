/*
public class TreeNode {
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;
	public TreeNode(int val) {
        this.val = val;
    }
};*/

public class Question_41 {
	// ����һ�ö����������������ȡ��Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�
	public static int TreeDepth(TreeNode pRoot) {
		if (pRoot == null)
			return 0;
		int left = TreeDepth(pRoot.left);
		int right = TreeDepth(pRoot.right);
		return left > right ? left + 1 : right + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
