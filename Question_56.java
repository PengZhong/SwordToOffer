
public class Question_56 {
	// ��ʵ��һ����������ƥ�����'.'��'*'��������ʽ��
	// ģʽ�е��ַ�'.'��ʾ����һ���ַ�����'*'��ʾ��ǰ����ַ����Գ�������Σ�����0�Σ���
	// �ڱ����У�ƥ����ָ�ַ����������ַ�ƥ������ģʽ��
	// ���磬�ַ���"aaa"��ģʽ"a.a"��"ab*ac*a"ƥ�䣬������"aa.a"��"ab*a"����ƥ��
	public boolean match(char[] str, char[] pattern) {
		if (str == null || pattern == null)
			return false;
		return matchCore(str, 0, pattern, 0);
	}

	public boolean matchCore(char[] str, int strIndex, char[] pattern, int patternIndex) {
		// str��patternͬʱ��ĩβ��ƥ��ɹ�
		if (strIndex == str.length && patternIndex == pattern.length)
			return true;
		// strû�е�ĩβ��pattern����ĩβ��ƥ��ʧ��
		if (strIndex != str.length && patternIndex == pattern.length)
			return false;

		// ģʽ��2����*, ���ַ�����һ����ģʽƥ��, ������ƥ��ģʽ; ����ƥ��, ģʽ������λ
		if (patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*') {
			if ((strIndex != str.length && str[strIndex] == pattern[patternIndex])
					|| (strIndex != str.length && pattern[patternIndex] == '.')) {
				return matchCore(str, strIndex, pattern, patternIndex + 2) // ģʽ����2λ, ��x*ƥ��0���ַ�
						|| matchCore(str, strIndex + 1, pattern, patternIndex + 2) // ģʽ����2λ, �ַ�������1λ, ƥ��һ���ַ�
						|| matchCore(str, strIndex + 1, pattern, patternIndex); // �ַ�������1λ, ģʽ������, ƥ����1��, ����ƥ��
			} else
				return matchCore(str, strIndex, pattern, patternIndex + 2);
		}

		// ģʽ��2������*, ���ַ�����1����ģʽ��1��ƥ��, ��������1λ, ���򷵻�false
		if ((strIndex != str.length && str[strIndex] == pattern[patternIndex]) || (strIndex != str.length && pattern[patternIndex] == '.'))
			return matchCore(str, strIndex + 1, pattern, patternIndex + 1);
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Question_56().match("".toCharArray(), ".*".toCharArray()));
	}

}
