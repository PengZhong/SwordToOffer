
public class Question_53 {
	// 把字符串转换成整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
	public int StrToInt(String str) {
		if (str == null || str.equals(""))
			return 0;
		char[] ch = str.toCharArray();
		boolean minus = false;
		long num = 0;
		int i = 0;
		if (ch[0] == '+')
			i++;
		else if (ch[0] == '-') {
			i++;
			minus = true;
		}
		for (; i < ch.length; i++) {
			if (ch[i] >= '0' && ch[i] <= '9')
				num = num * 10 + (int) (ch[i] - '0');
			else {
				num = 0;
				break;
			}
			if ((num > 0x7FFFFFFF && (!minus)) || (num < 0x80000000 && minus)) {
				num = 0;
				break;
			}
		}
		if (minus)
			num = (-1) * num;
		return (int) num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Question_53().StrToInt("-2147483648"));

	}

}
