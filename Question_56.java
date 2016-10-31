
public class Question_56 {
	// 请实现一个函数用来匹配包括'.'和'*'的正则表达式。
	// 模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。
	// 在本题中，匹配是指字符串的所有字符匹配整个模式。
	// 例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
	public boolean match(char[] str, char[] pattern) {
		if (str == null || pattern == null)
			return false;
		return matchCore(str, 0, pattern, 0);
	}

	public boolean matchCore(char[] str, int strIndex, char[] pattern, int patternIndex) {
		// str和pattern同时到末尾，匹配成功
		if (strIndex == str.length && patternIndex == pattern.length)
			return true;
		// str没有到末尾，pattern到了末尾，匹配失败
		if (strIndex != str.length && patternIndex == pattern.length)
			return false;

		// 模式第2个是*, 且字符串第一个跟模式匹配, 分三种匹配模式; 若不匹配, 模式后移两位
		if (patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*') {
			if ((strIndex != str.length && str[strIndex] == pattern[patternIndex])
					|| (strIndex != str.length && pattern[patternIndex] == '.')) {
				return matchCore(str, strIndex, pattern, patternIndex + 2) // 模式后移2位, 视x*匹配0个字符
						|| matchCore(str, strIndex + 1, pattern, patternIndex + 2) // 模式后移2位, 字符串后移1位, 匹配一个字符
						|| matchCore(str, strIndex + 1, pattern, patternIndex); // 字符串后移1位, 模式不后移, 匹配了1个, 继续匹配
			} else
				return matchCore(str, strIndex, pattern, patternIndex + 2);
		}

		// 模式第2个不是*, 且字符串第1个跟模式第1个匹配, 即都后移1位, 否则返回false
		if ((strIndex != str.length && str[strIndex] == pattern[patternIndex]) || (strIndex != str.length && pattern[patternIndex] == '.'))
			return matchCore(str, strIndex + 1, pattern, patternIndex + 1);
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Question_56().match("".toCharArray(), ".*".toCharArray()));
	}

}
