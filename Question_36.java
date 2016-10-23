
public class Question_36 {
	// ��ֻ��������2��3��5��������������Ugly Number��������6��8���ǳ�������14���ǣ���Ϊ����������7�� 
	// ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
	public static int min(int num1, int num2) {
		if (num1 > num2)
			return num2;
		else
			return num1;
	}
	
	public static int GetUglyNumber_Solution(int index) {
		if (index < 0)
			return 0;
		int[] numbers = new int[index];
		int t2 = 0, t3 = 0, t5 = 0;
		numbers[0] = 1;
		for (int i = 1; i < index; i++) {
			numbers[i] = min(numbers[t2] * 2, min(numbers[t3] * 3, numbers[t5] * 5));
			if (numbers[i] == numbers[t2] * 2)
				t2++;
			if (numbers[i] == numbers[t3] * 3)
				t3++;
			if (numbers[i] == numbers[t5] * 5)
				t5++;
		}
        return numbers[index - 1];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GetUglyNumber_Solution(10));

	}

}
