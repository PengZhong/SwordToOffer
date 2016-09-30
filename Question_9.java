
public class Question_9 {
	
	// 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。n<=39
	
	public static int solution(int n) {
		if (n == 0 || n == 1)
			return n;
		int i = 2;
		int f1 = 0;
		int f2 = 1;
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
		System.out.println(solution(4));
	}

}
