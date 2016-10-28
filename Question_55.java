
public class Question_55 {
	// 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1]
	// 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法
	public int[] multiply(int[] A) {
		// 以矩阵的思路考虑每一行分别是B0, B1, B2, ..., Bn-1
		if (A == null || A.length == 0)
			return null;
		int[] B = new int[A.length];
		B[0] = 1;
		// 计算A[0] * A[1] * A[2] * ... * A[i-1]
		for (int i = 1; i < B.length; i++)
			B[i] = B[i - 1] * A[i - 1];
		
		int temp = 1;
		for (int j = B.length - 2; j >= 0; j--) {
			temp = A[j + 1] * temp;    // 计算剩余部分A[i+1] * A[i+2] * ... * A[n-1]
			B[j] = B[j] * temp;    // 最终数组B中元素的值等于前半部分与后半部分相乘
		}
		return B;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
