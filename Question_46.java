
public class Question_46 {
	// ����һ���������ַ�����S���������ѭ������Kλ������������
	// ���磬�ַ�����S=��abcXYZdef��,Ҫ�����ѭ������3λ��Ľ��������XYZdefabc��
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
