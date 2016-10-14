
class LNode {
    int val;
    LNode next = null;

    LNode(int val) {
        this.val = val;
    }
}

public class Question19 {
	// 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
	public static LNode merge(LNode list1, LNode list2) {
		if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;
		LNode head = null;
		LNode current = null;
		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				if (head == null) {
					current = head = list1;
				} else {
					current.next = list1;
					current = current.next;
				}
				list1 = list1.next;
			} else {
				if (head == null) {
					current = head = list2;
				} else {
					current.next = list2;
					current = current.next;
				}
				list2 = list2.next;
			}
		}
		if (list1 != null)
			current.next = list1;
		if (list2 != null)
			current.next = list2;
		
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
