import java.util.ArrayList;
import java.util.TreeSet;

public class Question_30 {
	// ����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С�
	// ���������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��
	// ����밴��ĸ˳�������
	public static ArrayList<String> Permutation(String str) {
		ArrayList<String> result = new ArrayList<String>();
		if (str == null || str.length() == 0)
			return result;
		char[] chars = str.toCharArray();
		TreeSet<String> temp = new TreeSet<String>();
		Permutation(chars, 0, temp);
		result.addAll(temp);
		return result;
	}

	public static void Permutation(char[] chars, int begin, TreeSet<String> temp) {
		if (chars == null || chars.length == 0 || begin < 0 || begin > chars.length - 1)
			return;
		if (begin == chars.length - 1)
			temp.add(String.valueOf(chars));
		else {
			for (int i = begin; i < chars.length; i++) {
				swap(chars, begin, i);
				Permutation(chars, begin + 1, temp);
				swap(chars, begin, i);
			}
		}
	}

	public static void swap(char[] chars, int i, int j) {
		char temp = chars[i];
		chars[i] = chars[j];
		chars[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a";
		System.out.println(Permutation(s));

	}

}
