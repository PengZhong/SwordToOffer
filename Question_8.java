public class Question_8 {

	// ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
	// ����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�
	// ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
	// NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
	
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
