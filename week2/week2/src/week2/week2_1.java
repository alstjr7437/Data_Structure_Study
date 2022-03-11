package week2;

public class week2_1 {
	public static int seq(int n) {
		if(n == 1)
			return 1;
		else
			return seq(n-1) + 3;
	}
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {		//0으로하면 -1 -2 뒤로 계속 함수가 돌아가서 안됨.
			System.out.print(seq(i) + " ");
		}
	}
}