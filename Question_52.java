
public class Question_52 {
	// дһ������������������֮�ͣ�Ҫ���ں������ڲ���ʹ��+��-��*��/����������š�
	public int Add(int num1, int num2) {
		// ���ӷ���Ϊ�������У���һ���������ǽ�λ�ð�λ��ӣ��൱�������������
		// �ڶ��������ǽ�λ����0��0��0��1��1��0�����������λ��ֻ��1��1ʱ�������λ���൱��������֮�������ƶ�һλ
		// ���������ظ�ǰ���������̣�ֱ�����ٲ�����λΪֹ
		int sum, carry;
		do {
			sum = num1 ^ num2;
			carry = (num1 & num2) << 1;
			num1 = sum;
			num2 = carry;
		} while (num2 != 0);
		return num1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Question_52().Add(0, -1));

	}

}
