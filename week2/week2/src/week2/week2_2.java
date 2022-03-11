package week2;

public class week2_2 {

	public static void A(int n) {
		if(n > 0) {
			System.out.println(n);
			A(n-1);
		}
	}
	public static void main(String[] args) {
		int x = 5;
		A(x);	
	}
}
