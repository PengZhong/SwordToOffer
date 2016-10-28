import java.util.Arrays;

public class Question_49 {
	// ���˿����������5���ƣ��ж��ǲ���һ��˳�ӣ�����5�����ǲ��������ġ�
	// 2~10Ϊ���ֱ���AΪ1��JΪ11��QΪ12��Kλ13������С�����Կ�����������
	public static boolean isContinuous(int[] numbers) {
		if (numbers == null || numbers.length < 1)
			return false;
		Arrays.sort(numbers);
		int numberOfZeros = 0;
		for (int each : numbers)
			if (each == 0)
				numberOfZeros++;
		int numberOfGap = 0;
		for (int i = numberOfZeros, j = i + 1; j < numbers.length; i++, j++) {
			if (numbers[i] == numbers[j])
				return false;
			numberOfGap += numbers[j] - numbers[i] - 1;
		}
		return numberOfGap > numberOfZeros ? false : true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 3, 1, 6, 4 };
		System.out.println(isContinuous(arr));

	}

}
