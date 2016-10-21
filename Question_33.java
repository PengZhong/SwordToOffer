
public class Question_33 {
	// 输入一个整形数组，数组里有正数也有负数。数组中一个或者连续多个整数组成一个子数组。
	// 求所有子数组的和的最大值。要求时间复杂度为O(n)
	public static int FindGreatestSumOfSubArray(int[] array) {
		if (array == null || array.length == 0)
			return 0;
		int curSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (curSum < 0)
				curSum = array[i];
			else
				curSum += array[i];
			if (curSum > maxSum)
				maxSum = curSum;
		}
		return maxSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, -2, 3, 10, -4, 7, 2, -5 };
		System.out.println(FindGreatestSumOfSubArray(arr));

	}

}
