
public class Question10 {
	
	// һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж�����������
	
	public static int solution(int n) {
		// ���ֻ��һ��̨��, ֻ��һ������, ���������̨��, ����������(����������һ��������)
		// ��n��̨�׵�ʱ��, ��һ��������ѡ��, һ����һ��, ��ʱ������Ŀ���ں���ʣ�µ�n-1��̨�׵�������Ŀ��Ϊf(n-1)
		// ���ǵ�һ��������, ��ʱ������Ŀ���ں���ʣ�µ�n-2��̨�׵�������Ŀ��Ϊf(n-2), ����f(n)=f(n-1)+f(n-2)
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
