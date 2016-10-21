import java.util.ArrayList;

public class Question_22 {

	// ����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣����磬
	// ����������¾��� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
	// �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10
	public static ArrayList<Integer> printMatrix(int[][] matrix) {
		if (matrix == null)
			return null;
		ArrayList<Integer> result = new ArrayList<Integer>();
		int rows = matrix.length - 1;
		int cols = matrix[0].length - 1;
		for (int i = 0; i * 2 <= rows && i * 2 <= cols; i++) {
			printCircle(result, i, rows - i, cols - i, matrix);
		}
		return result;
	}

	public static void printCircle(ArrayList<Integer> list, int start, int row, int col, int[][] matrix) {
		for (int i = start; i <= col; i++)
			list.add(matrix[start][i]);
		if (start == row)
			return;
		for (int i = start + 1; i <= row; i++)
			list.add(matrix[i][col]);
		if (start == col)
			return;
		for (int i = col - 1; i >= start; i--)
			list.add(matrix[row][i]);
		for (int i = row - 1; i >= start + 1; i--)
			list.add(matrix[i][start]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int[][] matrix2 = { { 1, } };
		int[][] matrix3 = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		int[][] matrix4 = { { 1 }, { 2 }, { 3 }, { 4 }, { 5 } };
		ArrayList<Integer> result = printMatrix(matrix);
		ArrayList<Integer> result2 = printMatrix(matrix2);
		ArrayList<Integer> result3 = printMatrix(matrix3);
		ArrayList<Integer> result4 = printMatrix(matrix4);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

	}

}
