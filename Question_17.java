
class Node {
    int val;
    Node next = null;

    Node(int val) {
        this.val = val;
    }
}

public class Question_17 {
	
	// 链表中倒数第k个节点
	public static Node findKthToTail(Node head, int k) {
		if (head == null || k == 0)
			return null;
		Node pAhead = head;
		Node pBehind = head;
		for (int i = 0; i < k-1; i++) {
			if (pAhead.next != null)
				pAhead = pAhead.next;
			else
				return null;
		}
		while (pAhead.next != null) {
			pAhead = pAhead.next;
			pBehind = pBehind.next;
		}
		return pBehind;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
