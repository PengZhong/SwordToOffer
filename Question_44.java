import java.util.ArrayList;

public class Question_44 {
	// С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100��
	// ���������������ڴ�,�����뾿���ж������������������еĺ�Ϊ100(���ٰ���������)��
	// û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22��
	// ���������������к�ΪS�������������С������ڰ��մ�С�����˳�����м䰴�տ�ʼ���ִ�С�����˳��
	public static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		// ����������begin��end�ֱ��ʾ���е����ֵ����Сֵ��
		// ���Ƚ�begin��ʼ��Ϊ1��end��ʼ��Ϊ2.
		// �����begin��end�ĺʹ���s�����Ǿʹ�������ȥ����С��ֵ(������begin),�෴��ֻ��Ҫ����end��
		// ��ֹ����Ϊ��һֱ����begin��(1+sum)/2����endС��sumΪֹ
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
