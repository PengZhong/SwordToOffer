
public class Question_16 {
	
	// 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
	// 所有的偶数位于位于数组的后半部分
	

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
		// 调整顺序基础上并保证奇数和奇数，偶数和偶数之间的相对位置不变。
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
