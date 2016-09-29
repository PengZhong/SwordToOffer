
public class Question_3 {

	// ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
	// �����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������

	public static boolean solution(int[][] arr, int key) {
		int rows = arr.length;
		int cols = arr[0].length;
		boolean found = false;
		int row = 0;
		int col = cols - 1;
		while (row < rows && col >= 0) {
			if (arr[row][col] == key) {
				return true;
			} else if (arr[row][col] < key) {
				row++;
			} else {
				col--;
			}
		}
		return found;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 6, 8, 11, 15 } };
		boolean result = solution(arr, 3);
		System.out.println(result);
	}

}
