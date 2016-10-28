
public class Question_51 {
	// 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）
	public static int Sum_Solution(int n) {
		int ans = n;
		boolean tmp = (ans > 0) && ((ans += Sum_Solution(n - 1)) > 0);
		return ans; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Sum_Solution(3));

	}

}
