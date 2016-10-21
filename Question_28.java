
class RandomListNode {
	int label;
	RandomListNode next = null;
	RandomListNode random = null;

	RandomListNode(int label) {
		this.label = label;
	}
}

public class Question_28 {
	// ����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬һ��ָ����һ���ڵ㣬��һ������ָ��ָ������һ���ڵ㣩��
	// ���ؽ��Ϊ���ƺ��������head����ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�
	public static RandomListNode Clone(RandomListNode pHead) {
		CloneNodes(pHead);
		ConnectSiblingNodes(pHead);
		return ReconnectNodes(pHead);
	}

	public static void CloneNodes(RandomListNode pHead) {
		if (pHead == null)
			return;
		RandomListNode tmp = pHead;
		while (tmp != null) {
			RandomListNode clone = new RandomListNode(tmp.label);
			clone.random = null;
			clone.next = tmp.next;
			tmp.next = clone;
			tmp = clone.next;
		}
	}

	public static void ConnectSiblingNodes(RandomListNode pHead) {
		RandomListNode tmp = pHead;
		while (tmp != null) {
			if (tmp.random != null)
				tmp.next.random = tmp.random.next;
			tmp = tmp.next.next;
		}
	}

	public static RandomListNode ReconnectNodes(RandomListNode pHead) {
		RandomListNode tmp = pHead;
		RandomListNode pCloneHead = null;
		RandomListNode pCloneNode = null;
		if (tmp != null) {
			pCloneHead = pCloneNode = tmp.next;
			tmp.next = pCloneNode.next;
			tmp = tmp.next;
		}
		while (tmp != null) {
			pCloneNode.next = tmp.next;
			pCloneNode = pCloneNode.next;
			tmp.next = pCloneNode.next;
			tmp = tmp.next;
		}
		return pCloneHead;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
