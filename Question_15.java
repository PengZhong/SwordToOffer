
public class Question_15 {
	// ��������n����˳���ӡ��1������nλʮ��������
	// ��������3�����ӡ��1��2��3һֱ������3λ��999
	
	public static boolean increment(int[] number) {
		boolean isOverFlow = false;
		int nTakeOver = 0;
		for (int i = number.length - 1; i >= 0; i--) {
			int sum = number[i] + nTakeOver;
			if (i == number.length - 1)
				sum++;
			if (sum >= 10) {
				if (i == 0) {
					isOverFlow = true;
				} else {
					sum -= 10;
					number[i] = sum;
					nTakeOver = 1;
				}
			} else {
				number[i] = sum;
				break;
			}
		}
		return isOverFlow;
	}
	
	public static void printNumber(int[] number) {
		boolean isBeginning0 = true;
		int length = number.length;
		for (int i = 0; i < length; i++) {
			if (isBeginning0 && number[i] != 0)
				isBeginning0 = false;
			if (!isBeginning0)
				System.out.print(number[i]);
		}
		System.out.print(" ");
	}

	public static void print1ToMaxNDigits(int n) {
		if (n <= 0)
			return;
		int[] number = new int[n];
		for (int i = 0; i < n; i++)
			number[i] = 0;
		while (!increment(number))
			printNumber(number);
		
	}
	
	//ȫ����ʵ�֡�nλ����ʮ��������ʵ����n����0��9��ȫ����
	public static void printDigits(int[] number, int length, int index) {
		if (index == length - 1) {
			printNumber(number);
			return;
		}
		for (int i = 0; i < 10; i++) {
			number[index + 1] = i;
			printDigits(number, length, index + 1);
		}
	}
	
	public static void print2(int n) {
		if (n <= 0)
			return;
		int[] number = new int[n];
		for (int i = 0; i< 10; i++) {
			number[0] = i;
			printDigits(number, n, 0);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print1ToMaxNDigits(2);
		print2(2);

	}

}
