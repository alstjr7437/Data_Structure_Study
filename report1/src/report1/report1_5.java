package report1;

public class report1_5 {
	static int count = 0;
	static int count2 = 0;
	public static void move(int n, String a, String b, String c) {
		count++;
		if(n > 0) {
			move(n-1, a, c, b);
			System.out.printf("탑[" + n + "]을 " + a + "기둥에서 " + b + "기둥으로 옮김\n", count2++);
			move(n-1, c, b, a);
		}
	}
	public static void main(String[] args) {	
		move(5, "a", "b", "c");
		System.out.println("함수 호출 횟수는 " + count); 
		System.out.println("원반 옮긴 횟수는 " + count2); 
	}
}

/*
함수 호출 횟수는 (n-1개의 원판 호출횟수x2)+1 이다.
원반 옮긴 횟수는 (n-1개의 원반 옮긴횟수x2)+1 이다.
둘 사이의 관계는 (옮긴 횟수x2)+1를 하면 호출 횟수가 나온다.
n개의 원판 옮긴 횟수는 n-1개의 원판 함수 호출 횟수!
(4)3 >(2) 2 a c b /(6) 2 b a c + 3 
2 a c b > (1)1 a b c /(3) 1 c a b + 2
2 b a c >(5) 1 b c a /(7) 1 a b c + 2
1 abc > 0??? / 0??? + 2
1 cab > 0??? / 0??? + 2
1 bca > 0??? / 0??? + 2
1 abc > 0??? / 0??? + 2
*/
