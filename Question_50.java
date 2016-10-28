
public class Question_50 {
	// 0, 1, ..., n-1��n�������ų�һ��ԲȦ, ������0��ʼÿ�δ����ԲȦ��ɾ����m�����֡�
	// �����ԲȦ��ʣ�µ����һ������
	public static int LastRemaining(int n, int m) {
		if (n == 0 || m == 0)
			return -1;
		int last = 0;
		for (int i = 2; i <= n; i++)
			last = (last + m) % i;
		return last;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LastRemaining(5, 3));

	}

}
