import java.util.Stack;

public class Question_24 {

	// ���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳��
	// ����ѹ��ջ���������־�����ȡ���������1,2,3,4,5��ĳջ��ѹ��˳������4��5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У�
	// ��4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�
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
