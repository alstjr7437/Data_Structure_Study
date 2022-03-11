package week2;

public class week2_3 {
	public static long fact1(int n) {
		int tmp = 1;
		for (int i = 2; i <= n; i++) {
			tmp = i * tmp;
		}
		return tmp;
	}
	public static long fact2(int n) {
		if(n == 0) 
			return 1;
		else 
			return n * fact2(n-1);
	}
	public static void main(String[] args) {
		System.out.println(fact1(5));		//반복문
		System.out.println(fact2(5));		//재귀함수
	}

}
