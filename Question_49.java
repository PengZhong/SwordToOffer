import java.util.Arrays;

public class Question_49 {
	// 从扑克牌中随机抽5张牌，判断是不是一个顺子，即这5张牌是不是连续的。
	// 2~10为数字本身，A为1，J为11，Q为12，K位13，而大小王可以看成任意数字
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
