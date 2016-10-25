
public class Question_38 {
	// �������е��������֣����ǰ��һ�����ִ��ں�������֣����������������һ������ԡ�
	// ����һ������,�����������е�����Ե�����P������P��1000000007ȡģ�Ľ������� �����P%1000000007
	public static int InversePairs(int[] array) {
		// �鲢����ĸĽ��������ݷֳ�ǰ����������(�ݹ�ֵ�ÿ���������һ��������)��
		// �ϲ����飬�ϲ�ʱ������ǰ�������ֵarray[i]���ں�������ֵarray[j]ʱ����ǰ��
		// ����array[i]~array[mid]���Ǵ���array[j]�ģ�count += mid+1 - i
		// �ο���ָOffer�����Ǹо���ָOffer�鲢��������һ���������̡�
		// ���о��ǲ��������������Ƚϴ󣬶�ÿ�η��ص�count mod(1000000007)����
		if (array == null || array.length == 0)
			return 0;
		int[] copy = new int[array.length];
		for (int i = 0; i < array.length; i++)
			copy[i] = array[i];
		int count = InversePairsCore(array, copy, 0, array.length - 1);
		return count;
	}

	public static int InversePairsCore(int[] arr, int[] copy, int low, int high) {
		if (low == high)
			return 0;
		int mid = (low + high) >> 1;
		int leftCount = InversePairsCore(arr, copy, low, mid) % 1000000007;
		int rightCount = InversePairsCore(arr, copy, mid + 1, high) % 1000000007;
		int count = 0;
		int i = mid;
		int j = high;
		int locCopy = high;
		while (i >= low && j > mid) {
			if (arr[i] > arr[j]) {
				count += j - mid;
				copy[locCopy--] = arr[i--];
				if (count >= 1000000007)
					count %= 1000000007;
			} else {
				copy[locCopy--] = arr[j--];
			}
		}
		for (; i >= low; i--)
			copy[locCopy--] = arr[i];
		for (; j > mid; j--)
			copy[locCopy--] = arr[j];
		for (int s = low; s <= high; s++)
			arr[s] = copy[s];
		return (leftCount + rightCount + count) % 1000000007;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 5, 6, 4 };
		System.out.println(InversePairs(arr));

	}

}
