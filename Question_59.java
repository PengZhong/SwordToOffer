
public class Question_59 {
	// һ�������а����������ҳ�������Ļ�����ڽ��
	public ListNode EntryNodeOfLoop(ListNode pHead) {
		ListNode meetingNode = MeetingNode(pHead);
		if (meetingNode == null)
			return null;
		
		// ��ȡ���а����Ľڵ����
		int nodeInLoop = 1;
		ListNode tmp = meetingNode;
		while (tmp.next != meetingNode) {
			tmp = tmp.next;
			nodeInLoop++;
		}
		
		// �ƶ�tmpָ��
		tmp = pHead;
		for (int i = 0; i < nodeInLoop; i++)
			tmp = tmp.next;
		
		// �ƶ�����ָ��tmp��tmp2
		ListNode tmp2 = pHead;
		while (tmp != tmp2) {
			tmp = tmp.next;
			tmp2 = tmp2.next;
		}
		return tmp;
	}
	
	public ListNode MeetingNode(ListNode pHead) {
		// ����������ڻ�, ����null; �������, ����
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
