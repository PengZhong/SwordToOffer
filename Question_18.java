
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Question_18 {
	// 输入一个链表，反转链表后，输出链表的所有元素。
	
	public static ListNode reverseList(ListNode head) {
		if (head == null)
			return null;
		ListNode reverseHead = null;
		ListNode pPre = null;
		ListNode pCur = head;
		ListNode pNext = null;
		while (pCur != null) {
			pNext = pCur.next;
			if (pNext == null) {
				reverseHead = pCur;
			}
			pCur.next = pPre;
			pPre = pCur;
			pCur = pNext;
		}
		return reverseHead;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
