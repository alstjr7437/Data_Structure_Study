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
		System.out.printf("값은 %d \n", seq(1));
		System.out.printf("호출된 횟수는 %d", count);
		//최초로 호출해서 1 > seq(4)를 호출해서 + > seq(3)를 호출해서 + > seq(2)를 호출해서 +  > seq(1)를 호출해서 + 
		//위와 같이 숫자부터 계속해서 -1을해서 호출되므로 양의정수 n만큼 호출한다. 
		//방법은 seq()코드에 count++를 넣어서 count를 출력해보면 편하다.
		
	}

}
