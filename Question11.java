
public class Question11 {
	
	// 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
	
	public static int solution(int n) {
		if (n == 0)
			return 0;
		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 1; i <= n; i++){
			dp[i] = 0;
			for (int j = 0; j < i; j++)
				dp[i] += dp[j];
		}
		return dp[n];
	}
	
	public static int solution2(int n) {
		// 除了最后一个台阶必须要跳之外, 其他台阶都有跳和不跳两种选择, 所以结果是2^(n-1)
		return 1 << --n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(2));
		System.out.println(solution2(2));
		System.out.println(solution(3));
		System.out.println(solution2(3));
	}

}
