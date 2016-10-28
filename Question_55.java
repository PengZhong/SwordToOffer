
public class Question_55 {
	// ����һ������A[0,1,...,n-1],�빹��һ������B[0,1,...,n-1]
	// ����B�е�Ԫ��B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]������ʹ�ó���
	public int[] multiply(int[] A) {
		// �Ծ����˼·����ÿһ�зֱ���B0, B1, B2, ..., Bn-1
		if (A == null || A.length == 0)
			return null;
		int[] B = new int[A.length];
		B[0] = 1;
		// ����A[0] * A[1] * A[2] * ... * A[i-1]
		for (int i = 1; i < B.length; i++)
			B[i] = B[i - 1] * A[i - 1];
		
		int temp = 1;
		for (int j = B.length - 2; j >= 0; j--) {
			temp = A[j + 1] * temp;    // ����ʣ�ಿ��A[i+1] * A[i+2] * ... * A[n-1]
			B[j] = B[j] * temp;    // ��������B��Ԫ�ص�ֵ����ǰ�벿�����벿�����
		}
		return B;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
