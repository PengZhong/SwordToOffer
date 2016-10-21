import java.util.Stack;

public class Question_24 {

	// 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
	// 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
	// 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
	public static boolean IsPopOrder(int[] pushA, int[] popA) {
		if (pushA == null || popA == null)
			return false;
		Stack<Integer> s = new Stack<Integer>();
		int j = 0;
		for (int i = 0; i < pushA.length; i++) {
			s.push(pushA[i]);
			if (s.lastElement() == popA[j]) {
				s.pop();
				j++;
			}
		}
		if (s.isEmpty())
			return true;
		while (j < popA.length) {
			if (s.pop() != popA[j])
				return false;
			else
				j++;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 4, 5, 3, 2, 1 };
		System.out.println(IsPopOrder(arr1, arr2));

	}

}
