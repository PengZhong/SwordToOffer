
public class Question_59 {
	// 一个链表中包含环，请找出该链表的环的入口结点
	public ListNode EntryNodeOfLoop(ListNode pHead) {
		ListNode meetingNode = MeetingNode(pHead);
		if (meetingNode == null)
			return null;
		
		// 获取环中包含的节点个数
		int nodeInLoop = 1;
		ListNode tmp = meetingNode;
		while (tmp.next != meetingNode) {
			tmp = tmp.next;
			nodeInLoop++;
		}
		
		// 移动tmp指向
		tmp = pHead;
		for (int i = 0; i < nodeInLoop; i++)
			tmp = tmp.next;
		
		// 移动连个指针tmp和tmp2
		ListNode tmp2 = pHead;
		while (tmp != tmp2) {
			tmp = tmp.next;
			tmp2 = tmp2.next;
		}
		return tmp;
	}
	
	public ListNode MeetingNode(ListNode pHead) {
		// 如果链表不存在环, 返回null; 如果存在, 返回
		if (pHead == null)
			return null;
		ListNode pSlow = pHead.next;
		if (pSlow == null)
			return null;
		ListNode pFast = pSlow.next;
		while (pFast != null && pSlow != null) {
			if (pFast == pSlow)
				return pFast;
			pSlow = pSlow.next;
			pFast = pFast.next;
			if (pFast != null)
				pFast = pFast.next;
		}
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
