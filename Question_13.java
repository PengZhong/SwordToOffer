
public class Question_13 {
	// ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
	public static int numberOf1(int n) {
		int count = 0;
		while (n!=0) {
			count++;
			n = n & (n-1);
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberOf1(3));
	}

}
