import java.util.ArrayList;
import java.util.TreeSet;

public class Question_30 {
	// 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
	// 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
	// 结果请按字母顺序输出。
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
