
public class Question_43 {
	// 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字
	public void FindNumsAppearOnce(int [] array, int num1[], int num2[]) {
		if (array == null || array.length == 0)
			return;
		int res = array[0];
		for (int i = 1; i < array.length; i++)
			res ^= array[i];
		int indexOf1 = GetFirst1(res);
		num1[0] = 0;
		num2[0] = 0;
		for (int j = 0; j < array.length; j++)
			if (isBit1(array[j], indexOf1))
				num1[0] ^= array[j];
			else
				num2[0] ^= array[j];
	}
	
	public int GetFirst1(int num) {
		int index = 0;
		while (((num & 1) == 0) && (index < 8 * 4)) {
			num = num >> 1;
			index++;
		}
		return index;
	}
	
	public boolean isBit1(int num, int index) {
		num = num >> index;
		if ((num & 1) == 0)
			return false;
		else 
			return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = new int[1];
		int[] num2 = new int[2];
		int[] arr = { 2, 4, 3, 6, 3, 2, 5, 5 };
		new Question_43().FindNumsAppearOnce(arr, num1, num2);
		System.out.println(num1[0]);
		System.out.println(num2[0]);

	}

}
