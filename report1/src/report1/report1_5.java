package report1;

public class report1_5 {
	static int count = 0;
	static int count2 = 0;
	public static void move(int n, String a, String b, String c) {
		count++;
		if(n > 0) {
			move(n-1, a, c, b);
			System.out.printf("ž[" + n + "]�� " + a + "��տ��� " + b + "������� �ű�\n", count2++);
			move(n-1, c, b, a);
		}
	}
	public static void main(String[] args) {	
		move(5, "a", "b", "c");
		System.out.println("�Լ� ȣ�� Ƚ���� " + count); 
		System.out.println("���� �ű� Ƚ���� " + count2); 
	}
}

/*
�Լ� ȣ�� Ƚ���� (n-1���� ���� ȣ��Ƚ��x2)+1 �̴�.
���� �ű� Ƚ���� (n-1���� ���� �ű�Ƚ��x2)+1 �̴�.
�� ������ ����� (�ű� Ƚ��x2)+1�� �ϸ� ȣ�� Ƚ���� ���´�.
n���� ���� �ű� Ƚ���� n-1���� ���� �Լ� ȣ�� Ƚ��!
(4)3 >(2) 2 a c b /(6) 2 b a c + 3 
2 a c b > (1)1 a b c /(3) 1 c a b + 2
2 b a c >(5) 1 b c a /(7) 1 a b c + 2
1 abc > 0??? / 0??? + 2
1 cab > 0??? / 0??? + 2
1 bca > 0??? / 0??? + 2
1 abc > 0??? / 0??? + 2
*/
