import java.util.Stack;

public class Question_23 {
	// 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
	Stack<Integer> m_data = new Stack<Integer>();
	Stack<Integer> m_min = new Stack<Integer>();

	public void push(int node) {
		m_data.push(node);
		if (m_min.isEmpty())
			m_min.push(node);
		else {
			if (node > m_min.lastElement())
				m_min.push(m_min.lastElement());
			else
				m_min.push(node);
		}
	}

	public void pop() {
		m_data.pop();
		m_min.pop();
	}

	public int top() {
		return m_data.lastElement();
	}

	public int min() {
		return m_min.lastElement();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
