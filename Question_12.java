
public class Question_12 {
	// 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
	// 请用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
	
	public static int rectCover(int n) {
		// 以n=8为例, 用第一个1*2的小矩形去覆盖最左边时有两种选择，竖着放或者横着放。
		// 当竖着放的时候右边还剩2*7的区域，这种情况下的覆盖方法记为f(7)
		// 接下来考虑横着放的情况，当1*2的小矩形横着放在左上角的时候，左下角必须也放一个横着的1*2小矩形
		// 而在右边还剩下2*6的区域，这种情况下的覆盖方法记为f(6)因此，f(8)=f(7)+f(6)，仍是斐波那契数列
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		int f1 = 1;
		int f2 = 1;
		int f = 0;
		int i = 2;
		while (i <= n) {
			f = f1 + f2;
			f1 = f2;
			f2 = f;
			i++;
		}
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
