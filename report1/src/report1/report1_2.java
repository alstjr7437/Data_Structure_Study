package report1;

public class report1_2 {
	static int count = 0;
	public static int seq(int n) {
		count++;
		if (n == 1)
			return 1;
		else 
			return seq(n-1) + 3;
	}
	
	public static void main(String[] args) {
		System.out.printf("���� %d \n", seq(1));
		System.out.printf("ȣ��� Ƚ���� %d", count);
		//���ʷ� ȣ���ؼ� 1 > seq(4)�� ȣ���ؼ� + > seq(3)�� ȣ���ؼ� + > seq(2)�� ȣ���ؼ� +  > seq(1)�� ȣ���ؼ� + 
		//���� ���� ���ں��� ����ؼ� -1���ؼ� ȣ��ǹǷ� �������� n��ŭ ȣ���Ѵ�. 
		//����� seq()�ڵ忡 count++�� �־ count�� ����غ��� ���ϴ�.
		
	}

}
