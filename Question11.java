
public class Question11 {
	
	// һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж�����������
	
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
		// �������һ��̨�ױ���Ҫ��֮��, ����̨�׶������Ͳ�������ѡ��, ���Խ����2^(n-1)
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
