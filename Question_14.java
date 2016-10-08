
public class Question_14 {
	// ����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η�
	
	public static boolean doubleEqual(double d1, double d2) {
		if (Math.abs(d1 - d2) < 0.000001)
			return true;
		else
			return false;
	}
	
	public static double powerWithUnsignedExp(double base, int exp) {
		if (exp == 0)
			return 1.0;
		if (exp == 1)
			return base;
		double result = 1.0;
		result = powerWithUnsignedExp(base, exp >> 1);
		result *= result;
		if ((exp & 0x1) == 1)
			result *= base;
		return result;
	}
	
	public static double power(double base, int exponent) {
		if (doubleEqual(base, 0.0) && exponent < 0)
			return 0.0;
		double result = 1.0;
		result = powerWithUnsignedExp(base, Math.abs(exponent));
		if (exponent < 0)
			return 1.0 / result;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
