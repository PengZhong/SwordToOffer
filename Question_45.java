import java.util.ArrayList;

public class Question_45 {
	// 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
	// 对应每个测试案例，输出两个数，小的先输出。
	public static ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if (array == null || array.length == 0)
			return res;
		int left = 0, right = array.length - 1;
		while (left < right) {
			int val = array[left] + array[right];
			if (val < sum)
				left++;
			else if (val > sum)
				right--;
			else {
				if (res.size() == 0) {
					res.add(array[left]);
					res.add(array[right]);
				} else {
					int multiVal = 1;
					for (int each : res)
						multiVal *= each;
					if (multiVal > array[left] * array[right]) {
						res.clear();
						res.add(array[left]);
						res.add(array[right]);
					}
				}
				left++;
				right--;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 4, 7, 11, 15 };
		System.out.println(FindNumbersWithSum(arr, 15));

	}

}
