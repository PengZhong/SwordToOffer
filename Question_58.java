
public class Question_58 {
	// ��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ������磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ��
	// ��һ��ֻ����һ�ε��ַ���"g"�����Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"��
	// �����ǰ�ַ���û�д��ڳ���һ�ε��ַ�������#�ַ���
	int[] count = new int[256]; 
	int index = 1;
	
	//Insert one char from stringstream
    public void Insert(char ch) {
        if (count[ch] == 0) {
        	count[ch] = index++;
        } else {
        	count[ch] = -1;
        }
    }
    
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
    	int temp = Integer.MAX_VALUE;
    	char ch = '#';
    	for (int i = 0; i < 256; i++) {
    		if (count[i] != 0 && count[i] != -1 && count[i] < temp) {
    			temp = count[i];
    			ch = (char)i;
    		}
    	}
    	return ch;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
