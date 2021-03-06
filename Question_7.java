import java.util.Stack;

public class Question_7 {
	// 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
	public void push(int node) {
		stack1.push(node);
	}
	
	public int pop() {
		if (stack2.isEmpty()) {
			if (stack1.isEmpty()) {
				throw new RuntimeException("queue is empty");
			} else {
				while (!stack1.isEmpty())
					stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question_7 queue = new Question_7();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		System.out.println(queue.pop());
		queue.push(4);
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
	}

}
