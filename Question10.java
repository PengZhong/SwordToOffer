
public class Question10 {
	
	// 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
	
	public static int solution(int n) {
		// 如果只有一个台阶, 只有一种跳法, 如果有两个台阶, 有两种跳法(分两次跳和一次跳两阶)
		// 跳n级台阶的时候, 第一次有两种选择, 一是跳一阶, 此时跳法数目等于后面剩下的n-1阶台阶的跳法数目即为f(n-1)
		// 二是第一次跳两阶, 此时跳法数目等于后面剩下的n-2级台阶的跳法数目即为f(n-2), 所以f(n)=f(n-1)+f(n-2)
		if (n <= 2)
			return n;
		int f1 = 1;
		int f2 = 2;
		int i = 3;
		int f = 0;
		while (i <= n) {
			f = f1 + f2;
			f1 = f2;
			f2 = f;
			i++;
		}
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(2));
	}

}
