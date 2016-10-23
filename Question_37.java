
public class Question_37 {
	// ��һ���ַ���(1<=�ַ�������<=10000��ȫ���ɴ�Сд��ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��
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
