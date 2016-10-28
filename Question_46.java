
public class Question_46 {
	// 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
	// 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”
	public static String LeftRotateString(String str, int n) {
		if (str == null || n < 0 || n > str.length())
			return "";
		char[] ch = str.toCharArray();
		reverse(ch, 0, n - 1);
		reverse(ch, n, str.length() - 1);
		reverse(ch, 0, str.length() - 1);
		return String.valueOf(ch);
	}

	public static void reverse(char[] ch, int start, int end) {
		while (start < end) {
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcXYZdef";
		System.out.println(LeftRotateString(str, 9));

	}

}
