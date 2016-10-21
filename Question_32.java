import java.util.ArrayList;

public class Question_32 {
	// 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4.
	public static ArrayList<Integer> GetLeastNumbers(int[] input, int k) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (input == null || input.length == 0 || k <= 0 || k > input.length)
			return result;
		int start = 0;
		int end = input.length - 1;
		int index = partition(input, start, end);
		while (index != k - 1) {
			if (index  > k - 1) {
				end = index - 1;
				index = partition(input, start, end);
			} else {
				start = index + 1;
				index = partition(input, start, end);
			}
		}
		for (int i = 0; i < k; i++)
			result.add(input[i]);
		return result;
	}
	
	public static int partition(int[] arr, int left, int right) {
		int temp = arr[left];
		while (left < right) {
			while (left < right && arr[right] >= temp)
				right--;
			arr[left] = arr[right];
			while (left < right && arr[left] <= temp)
				left++;
			arr[right] = arr[left];
		}
		arr[left] = temp;
		return left;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 5, 1, 6, 2, 7, 3, 8};
		int[] arr2 = {4, 5, 1, 6, 2, 7, 3, 8};
		int[] arr3 = {4, 5, 1, 6, 2, 7, 3, 8};
		System.out.println(GetLeastNumbers(arr, 4));
		System.out.println(GetLeastNumbers(arr2, 8));
		System.out.println(GetLeastNumbers(arr3, 10));

	}

}
