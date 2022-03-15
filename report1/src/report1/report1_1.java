package report1;

public class report1_1 {
	public static int seq(int n) {
		if (n == 1)
			return 0;
		else 
			return 5 * seq(n-1) + 3;
	}
	
	public static void main(String[] args) {
		System.out.println(seq(3));

	}

}
