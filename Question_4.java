
public class Question_4 {
	// �滻�ո�
	// ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20����
	// ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy
	
	public static String solution(StringBuffer str) {
		// �½��ַ���ʵ��
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				result.append("%20");
			} else {
				result.append(str.charAt(i));
			}
		}
		return result.toString();
	}
	
	public static String solution2(StringBuffer str) {
		// ��ԭ���ַ�����ʵ��, ��ǰ����ɨ��һ��, �õ���Ҫ�滻�Ŀո����
		// �������ݺ��ַ�������, �Ӻ���ǰ�����ַ���, ��ʼ�滻����
		int spaceNum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				spaceNum++;
			}
		}
		
		int i = str.length() - 1; // ԭʼ�ַ���ĩβ�ַ������±�
		int index = i + 2 * spaceNum; // ���ַ���ĩβ�����±�
		str.setLength(index + 1);
		while (i >= 0) {
			if (str.charAt(i) == ' ') {
				str.setCharAt(index--, '0');
				str.setCharAt(index--, '2');
				str.setCharAt(index--, '%');
				i--;
			} else {
				str.setCharAt(index, str.charAt(i));
				index--;
				i--;
			}
		}
		return str.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "We are happy.";
		System.out.println(solution(new StringBuffer(str)));
		System.out.println(solution2(new StringBuffer(str)));
	}

}
