
public class Question_39 {
	// �������������ҳ����ǵĵ�һ��������㡣
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		// �ȱ�����������õ����������ȣ��ɴ˿ɵ���������ĳ��Ȳ�lengthDiff
		// ���ڳ���������lengthDiff���ȸ���㣬֮��ͬʱ�������������ҵ���ͬ�ڵ�
		int length1 = GetListLength(pHead1);
		int length2 = GetListLength(pHead2);
		ListNode pListLong = null;
		ListNode pListShort = null;
		int lengthDiff = 0;
		if (length1 < length2) {
			pListLong = pHead2;
			pListShort = pHead1;
			lengthDiff = length2 - length1;
		} else {
			pListLong = pHead1;
			pListShort = pHead2;
			lengthDiff = length1 - length2;
		}
		for (int i = 0; i < lengthDiff; i++)
			pListLong = pListLong.next;
		while ((pListLong != null) && (pListShort != null) && (pListLong != pListShort)) {
			pListLong = pListLong.next;
			pListShort = pListShort.next;
		}
		return pListLong;
	}

	public static int GetListLength(ListNode pHead) {
		ListNode tmp = pHead;
		int length = 0;
		while (tmp != null) {
			length++;
			tmp = tmp.next;
		}
		return length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
