
public class Question_51 {
	// ��1+2+3+...+n��Ҫ����ʹ�ó˳�����for��while��if��else��switch��case�ȹؼ��ּ������ж���䣨A?B:C��
	public static int Sum_Solution(int n) {
		int ans = n;
		boolean tmp = (ans > 0) && ((ans += Sum_Solution(n - 1)) > 0);
		return ans; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Sum_Solution(3));

	}

}
