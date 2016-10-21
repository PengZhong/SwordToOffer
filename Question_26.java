import java.util.Arrays;

public class Question_26 {
	// ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ��������������Yes,�������No��
	// �������������������������ֶ�������ͬ��
	
	public static boolean VerifySquenceOfBST(int[] sequence) {
		if (sequence == null || sequence.length == 0)
			return false;
		int root = sequence[sequence.length - 1];
		int i = 0;
		for (i = 0; i < sequence.length - 1; i++)
			if (sequence[i] > root)
				break;
		int j = i;
		for (; j < sequence.length - 1; j++)
			if (sequence[j] < root)
				return false;
		boolean left = true, right = true;
		if (i > 0)
			left = VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, i));
		if (i < sequence.length - 1)
			right = VerifySquenceOfBST(Arrays.copyOfRange(sequence, i, sequence.length - 1));
		return (left && right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 7, 6, 9, 11, 10, 8 };
		int[] arr2 = { 7, 4, 6, 5 };
		System.out.println(VerifySquenceOfBST(arr));
		System.out.println(VerifySquenceOfBST(arr2));

	}

}
