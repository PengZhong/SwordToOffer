
public class Question_47 {
	// 翻转单词顺序
	// “student. a am I”，正确的句子应该是“I am a student.”。
	public static String ReverseSentence(String str) {
		if (str == null || str.equals(""))
			return "";
		if (str.trim().equals(""))
			return str;
		String[] s = str.split(" ");
		StringBuffer sb = new StringBuffer();
		for (int i = s.length - 1; i > 0; i--) {
			sb.append(s[i]);
			sb.append(" ");
		}
		sb.append(s[0]);
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I am a student.";
		System.out.println(ReverseSentence(s));

	}

}
