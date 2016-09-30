public class Question_8 {

	// 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
	// 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
	// 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
	// NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
	
	public static int minInOrder(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min)
				min = array[i];
		}
		return min;
	}

	public static int solution(int[] array) {
		if (array == null || array.length == 0)
			return 0;
		int left = 0;
		int right = array.length - 1;
		int mid = left;
		while (array[left] >= array[right]) {
			if (right - left == 1) {
				mid = right;
				break;
			}
			mid = (left + right) / 2;
			if (array[left] == array[mid] && array[mid] == array[right])
				return minInOrder(array);
			if (array[mid] >= array[left]) {
				left = mid;
			} else {
				right = mid;
			}
		}
		return array[mid];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 3, 4, 5, 1, 2 };
		int[] array2 = { 1, 0, 1, 1, 1 };
		System.out.println(solution(array));
		System.out.println(solution(array2));
		
	}

}
