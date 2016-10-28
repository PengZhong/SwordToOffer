import java.util.ArrayList;

public class Question_44 {
	// 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
	// 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
	// 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
	// 输出描述：输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
	public static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		// 用两个数字begin和end分别表示序列的最大值和最小值，
		// 首先将begin初始化为1，end初始化为2.
		// 如果从begin到end的和大于s，我们就从序列中去掉较小的值(即增大begin),相反，只需要增大end。
		// 终止条件为：一直增加begin到(1+sum)/2并且end小于sum为止
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if (sum < 3)
			return res;
		int start = 1, end = 2, mid = (sum + 1) / 2;
		int curSum = start + end;
		while (start < mid) {
			if (curSum == sum)
				saveResult(res, start, end);
			while (curSum > sum && start < mid) {
				curSum -= start;
				start++;
				if (curSum == sum)
					saveResult(res, start, end);
			}
			end++;
			curSum += end;
		}
		return res;
	}
	
	public static void saveResult(ArrayList<ArrayList<Integer>> res, int start, int end) {
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		for (int i = start; i <= end; i++)
			tmp.add(i);
		res.add(tmp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FindContinuousSequence(9));

	}

}
