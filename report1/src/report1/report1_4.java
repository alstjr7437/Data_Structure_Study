package report1;

public class report1_4 {
	static int count = 0;

	public static void move(int n, String a, String b, String c) {
		count++;
		if(n > 0) {
			move(n-1, a, c, b);
			System.out.println("ž[" + n + "]�� " + a + "��տ��� " + b + "������� �ű�");
			move(n-1, c, b, a);
		}
	}//b a c
	public static void main(String[] args) {	
		move(4, "a", "b", "c");
		System.out.println(count); 
	}
}

/*
�Լ� ȣ�� Ƚ���� 
(n-1���� ���� ȣ��Ƚ��x2)+1 �̴�.
(4)3 >(2) 2 a c b /(6) 2 b a c + 3 
2 a c b > (1)1 a b c /(3) 1 c a b + 2
2 b a c >(5) 1 b c a /(7) 1 a b c + 2
1 abc > 0??? / 0??? + 2
1 cab > 0??? / 0??? + 2
1 bca > 0??? / 0??? + 2
1 abc > 0??? / 0??? + 2
*/
