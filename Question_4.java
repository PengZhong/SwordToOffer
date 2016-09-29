
public class Question_4 {
	// 替换空格
	// 请实现一个函数，将一个字符串中的空格替换成“%20”。
	// 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy
	
	public static String solution(StringBuffer str) {
		// 新建字符串实现
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
		// 在原有字符串上实现, 从前往后扫描一遍, 得到需要替换的空格个数
		// 计算扩容后字符串长度, 从后向前遍历字符串, 开始替换过程
		int spaceNum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				spaceNum++;
			}
		}
		
		int i = str.length() - 1; // 原始字符串末尾字符所在下标
		int index = i + 2 * spaceNum; // 新字符串末尾所在下标
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
