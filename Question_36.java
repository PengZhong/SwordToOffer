
public class Question_36 {
	// 把只包含因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含因子7。 
	// 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
	public static int min(int num1, int num2) {
		if (num1 > num2)
			return num2;
		else
			return num1;
	}
	
	public static int GetUglyNumber_Solution(int index) {
		if (index < 0)
			return 0;
		int[] numbers = new int[index];
		int t2 = 0, t3 = 0, t5 = 0;
		numbers[0] = 1;
		for (int i = 1; i < index; i++) {
			numbers[i] = min(numbers[t2] * 2, min(numbers[t3] * 3, numbers[t5] * 5));
			if (numbers[i] == numbers[t2] * 2)
				t2++;
			if (numbers[i] == numbers[t3] * 3)
				t3++;
			if (numbers[i] == numbers[t5] * 5)
				t5++;
		}
        return numbers[index - 1];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GetUglyNumber_Solution(10));

	}

}
