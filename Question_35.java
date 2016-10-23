import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Question_35 {
	// 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
	// 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323
	public static int cmp(int num1, int num2) {
		String numStr1 = String.valueOf(num1);
		String numStr2 = String.valueOf(num2);
		int len1 = numStr1.length();
		int len2 = numStr2.length();
		if (len1 < len2) {
			int i = 0;
			for (i = 0; i < len1; i++) {
				if (numStr1.charAt(i) > numStr2.charAt(i))
					return 1;
				else if (numStr1.charAt(i) < numStr2.charAt(i))
					return -1;
				else
					continue;
			}
			while (i < len2) {
				if (numStr2.charAt(i) > numStr1.charAt(len1 - 1))
					return -1;
				else if (numStr2.charAt(i) < numStr1.charAt(len1 - 1))
					return 1;
				else
					i++;
			}
			return 0;
		} else if (len1 > len2) {
			int i = 0;
			for (i = 0; i < len2; i++) {
				if (numStr1.charAt(i) > numStr2.charAt(i))
					return 1;
				else if (numStr1.charAt(i) < numStr2.charAt(i))
					return -1;
				else
					continue;
			}
			while (i < len1) {
				if (numStr1.charAt(i) > numStr2.charAt(len2 - 1))
					return 1;
				else if (numStr1.charAt(i) < numStr2.charAt(len2 - 1))
					return -1;
				else
					i++;
			}
			return 0;
		} else {
			for (int i = 0; i < len1; i++) {
				if (numStr1.charAt(i) > numStr2.charAt(i))
					return 1;
				else if (numStr1.charAt(i) < numStr2.charAt(i))
					return -1;
				else
					continue;
			}
			return 0;
		}
	}

	public static String PrintMinNumber(int[] numbers) {
		String result = "";
		if (numbers == null || numbers.length == 0)
			return result;
		int length = numbers.length;
		for (int i = 0; i < length - 1; i++)
			for (int j = 1; j < length - i; j++)
				if (cmp(numbers[j - 1], numbers[j]) == 1) {
					int temp = numbers[j - 1];
					numbers[j - 1] = numbers[j];
					numbers[j] = temp;
				}
		for (int each : numbers)
			result += each;
		return result;
	}

	public static String PrintMinNumber2(int[] numbers) {
		int n;
		String s = "";
		ArrayList<Integer> list = new ArrayList<Integer>();
		n = numbers.length;
		for (int i = 0; i < n; i++) {
			list.add(numbers[i]);

		}
		Collections.sort(list, new Comparator<Integer>() {

			public int compare(Integer str1, Integer str2) {
				String s1 = str1 + "" + str2;
				String s2 = str2 + "" + str1;
				return s1.compareTo(s2);
			}
		});

		for (int j : list) {
			s += j;
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 32, 321 };
		System.out.println(PrintMinNumber(arr));
		System.out.println(PrintMinNumber2(arr));

	}

}
