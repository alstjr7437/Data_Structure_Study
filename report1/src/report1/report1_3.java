package report1;

public class report1_3 {
	static int count = 0;
	public static int fib(int n) {
		count++;
		if (n == 1 || n == 2)
			return 1;
		else 
			return fib(n-1) + fib(n-2);
	}
	
	public static void main(String[] args) {
		System.out.printf("���� %d \n", fib(5));
		System.out.printf("ȣ��� Ƚ���� %d", count);
		// fib(5) ȣ�� +1 > fib(5)�� fib(4),fib(3)�� ȣ���ؼ� +2 > (5���� ����4)fib(4)�� fib(3),fib(2)�� ȣ���ؼ� +2 
		// > (5���� ���� 3) fib(3)�� fib(2),fib(1)ȣ���ؼ� +2  > (4���� ����3)fib(3)�� ȣ���ؼ� fib(2),fib(1)�� ȣ���ؼ� +2 
		// fib(2)�� fib(1)�� ���� �߰��� fib()�� ȣ������ �ʰ� ����1�� ���� ������ 2���� ���� 1 ������ ����.
		
	}

}
