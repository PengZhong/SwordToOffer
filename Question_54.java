
public class Question_54 {
	// ��һ������Ϊn����������������ֶ���0��n-1�ķ�Χ�ڡ� ������ĳЩ�������ظ��ģ�����֪���м����������ظ��ġ�
	// Ҳ��֪��ÿ�������ظ����Ρ����ҳ�����������һ���ظ������֡�
	// ���磬������볤��Ϊ7������{2,3,1,0,2,5,3}����ô��Ӧ��������ظ�������2����3��
	public boolean duplicate(int numbers[], int length, int[] duplication) {
		// Parameters:
		// numbers: an array of integers
		// length: the length of array numbers
		// duplication: (Output) the duplicated number in the array number,
		// length of duplication array is 1,so using duplication[0] = ? in
		// implementation;
		// Here duplication like pointor in C/C++, duplication[0] equal
		// *duplication in C/C++
		// ����Ҫ�ر�ע��~���������ظ���һ������ֵduplication[0]
		// Return value: true if the input is valid,
		// and there are some duplications in the array number otherwise false
		if (numbers == null || numbers.length < 2 || length < 2)
			return false;
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			if (arr[numbers[i]] == 1) {
				duplication[0] = numbers[i];
				return true;
			} else
				arr[numbers[i]] = 1;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 1, 0, 2, 5, 3 };
		int[] res = new int[1];
		System.out.println(new Question_54().duplicate(arr, arr.length, res));
		System.out.println(res[0]);
	}

}
