
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Question_18 {
	// ����һ��������ת�����������������Ԫ�ء�
	
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
