
class RandomListNode {
	int label;
	RandomListNode next = null;
	RandomListNode random = null;

	RandomListNode(int label) {
		this.label = label;
	}
}

public class Question_28 {
	// 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
	// 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
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
