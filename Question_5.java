import java.util.ArrayList;
import java.util.Stack;

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}

public class Question_5 {
	
	// ����һ��������β��ͷ��ӡ����ÿ���ڵ��ֵ

	public static ArrayList<Integer> solution(ListNode listNode) {
		Stack<Integer> stack = new Stack<Integer>();
		ListNode head = listNode;
		while (head != null) {
			stack.push(head.val);
			head = head.next;
		}
		ArrayList<Integer> array = new ArrayList<Integer>();
		while (!stack.isEmpty()) {
			array.add(stack.pop());
		}
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		System.out.println(solution(head));
	}

}
