
public class Question_33 {
	// ����һ���������飬������������Ҳ�и�����������һ��������������������һ�������顣
	// ������������ĺ͵����ֵ��Ҫ��ʱ�临�Ӷ�ΪO(n)
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
