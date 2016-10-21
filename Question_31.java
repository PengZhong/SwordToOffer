
public class Question_31 {
	// ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡���������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
	// ��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0
	public static int MoreThanHalfNum(int[] array) {
		if (array == null || array.length == 0)
			return 0;
		int start = 0;
		int end = array.length - 1;
		int index = partition(array, start, end);
		int mid = array.length >> 1;
		//int mid = (start + end) / 2; �˴����������ã���Ҫ��֤mid�Ǵ��ڵ����м�λ���±��ֵ
		while (index != mid) {
			if (index > mid) {
				end = index - 1;
				index = partition(array, start, end);
			} else {
				start = index + 1;
				index = partition(array, start, end);
			}
		}
		int result = array[mid];
		if (!CheckMoreThanHalf(array, result))
			result = 0;
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

	public static boolean CheckMoreThanHalf(int[] array, int result) {
		int times = 0;
		for (int i = 0; i < array.length; i++)
			if (array[i] == result)
				times++;
		if (times * 2 <= array.length)
			return false;
		return true;
	}
	
	
	// �ڶ��ֽⷨ
	public static int solution2(int[] arr) {
		if (arr == null || arr.length == 0)
			return 0;
		int result = arr[0];
		int times = 1;
		for (int i = 1; i < arr.length; i++)
			if (times == 0) {
				result = arr[i];
				times = 1;
			} else {
				if (arr[i] == result)
					times++;
				else
					times--;
			}
		if (!CheckMoreThanHalf(arr, result))
			result = 0;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 2, 2, 2, 5, 4, 2 };
		System.out.println(MoreThanHalfNum(arr));
	}

}
