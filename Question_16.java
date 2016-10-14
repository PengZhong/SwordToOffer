
public class Question_16 {
	
	// ����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣�
	// ���е�ż��λ��λ������ĺ�벿��
	

	public static void ReorderOddEven(int[] arr) {
		int length = arr.length;
		int left = 0, right = length - 1;
		while (left < right) {
			while (left < right && (arr[left] & 0x1) == 1) {
				left++;
			}
			while (left < right && (arr[right] & 0x1) == 0) {
				right--;
			}
			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
	}
	
	public static void show(int[] arr) {
		for (int each: arr)
			System.out.print(each + " ");
		System.out.println("");
	}
	
	public static void reOrderArrayWithOrder(int[] array) {
		// ����˳������ϲ���֤������������ż����ż��֮������λ�ò��䡣
		for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j]%2==1 && array[j-1]%2==0) {
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		show(arr);
		ReorderOddEven(arr);
		show(arr);
		int[] arr2 = {1, 2, 3, 4, 5};
		show(arr2);
		reOrderArrayWithOrder(arr2);
		show(arr2);

	}

}
