
public class Question_57 {
	// ��ʵ��һ�����������ж��ַ����Ƿ��ʾ��ֵ������������С������
	// ���磬�ַ���"+100","5e2","-123","3.1416"��"-1E-16"����ʾ��ֵ��
	// ����"12e","1a3.14","1.2.3","+-5"��"12e+4.3"�����ǡ�
	public boolean isNumeric(char[] str) {
		if (str == null || str.length == 0)
			return false;
		int length = str.length;
		int current = 0;
		if (str[current] == '+' || str[current] == '-') {
			current++;
			if (current == length)
				return false;
		}
		current = scanDigits(str, current);
		if (current == length)
			return true;

		if (str[current] == '.') {
			current++;
			if (current == length)
				return false;
			current = scanDigits(str, current);
			if (current == length)
				return true;
		}

		if (str[current] == 'e' || str[current] == 'E') {
			current++;
			if (current == length)
				return false;
			if (str[current] == '+' || str[current] == '-') {
				current++;
				if (current == length)
					return false;
			}
			current = scanDigits(str, current);
			if (current == length)
				return true;
		}
		return false;
	}

	public int scanDigits(char[] str, int current) {
		int res = current;
		for (; res < str.length; res++)
			if (str[res] < '0' || str[res] > '9')
				break;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] str = "+100".toCharArray();
		System.out.println(new Question_57().isNumeric(str));

	}

}
