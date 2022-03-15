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
		System.out.printf("값은 %d \n", fib(5));
		System.out.printf("호출된 횟수는 %d", count);
		// fib(5) 호출 +1 > fib(5)가 fib(4),fib(3)을 호출해서 +2 > (5에서 나온4)fib(4)가 fib(3),fib(2)를 호출해서 +2 
		// > (5에서 나온 3) fib(3)이 fib(2),fib(1)호출해서 +2  > (4에서 나온3)fib(3)이 호출해서 fib(2),fib(1)을 호출해서 +2 
		// fib(2)와 fib(1)은 따로 추가로 fib()를 호출하지 않고 리턴1로 가기 때문에 2에서 나온 1 같은게 없음.
		
	}

}
