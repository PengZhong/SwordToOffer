
public class Question_37 {
	// 在一个字符串(1<=字符串长度<=10000，全部由大小写字母组成)中找到第一个只出现一次的字符,并返回它的位置
	public static int FirstNotRepeatingChar(String str) {
		char[] c = str.toCharArray();
		int[] hash = new int[256];
		for (char each : c)
			hash[(int) each]++;
		for (int i = 0; i < c.length; i++)
			if (hash[(int)c[i]] == 1)
				return i;
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abaccdeff";
		System.out.println(FirstNotRepeatingChar(str));

	}

}
