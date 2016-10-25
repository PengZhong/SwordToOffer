
public class Question_40 {
	// 统计一个数字在排序数组中出现的次数。
	public static int GetNumberOfK(int[] array, int k) {
		if (array == null || array.length == 0)
			return 0;
		int start = GetFirstK(array, k);
		int end = GetLastK(array, k);
		if (start > -1 && end > -1)
			return end - start + 1;
		else
			return 0;
	}

	public static int GetFirstK(int[] array, int k) {
		int left = 0, right = array.length - 1;
		while (left <= right) {
			int mid = (left + right) >> 1;
			if (array[mid] < k)
				left = mid + 1;
			else if (array[mid] > k)
				right = mid - 1;
			else {
				if (mid == 0 || (mid > 0 && array[mid - 1] != k))
					return mid;
				else
					right = mid - 1;
			}
		}
		return -1;
	}

	public static int GetLastK(int[] array, int k) {
		int left = 0, right = array.length - 1;
		while (left <= right) {
			int mid = (left + right) >> 1;
			if (array[mid] < k)
				left = mid + 1;
			else if (array[mid] > k)
				right = mid - 1;
			else {
				if (mid == array.length - 1 || (mid < array.length - 1 && array[mid + 1] != k))
					return mid;
				else
					left = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 3, 3, 3, 4, 5 };
		System.out.println(GetNumberOfK(arr, 3));

	}

}
