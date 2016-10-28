
public class Question_52 {
	// 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
	public int Add(int num1, int num2) {
		// 将加法分为三步进行，第一步：不考虑进位得按位相加，相当于两个数做异或
		// 第二步：考虑进位，对0和0，0和1，1和0都不会产生进位，只有1加1时会产生进位，相当于与运算之后向左移动一位
		// 第三步：重复前面两步过程，直到不再产生进位为止
		int sum, carry;
		do {
			sum = num1 ^ num2;
			carry = (num1 & num2) << 1;
			num1 = sum;
			num2 = carry;
		} while (num2 != 0);
		return num1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Question_52().Add(0, -1));

	}

}
