package week2;

public class week2_1 {
	public static int seq(int n) {
		if(n == 1)
			return 1;
		else
			return seq(n-1) + 3;
	}
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {		//0�����ϸ� -1 -2 �ڷ� ��� �Լ��� ���ư��� �ȵ�.
			System.out.print(seq(i) + " ");
		}
	}
}