package week3;

class TestAnIm implements Testing{

	@Override
	public void prt1() {
		System.out.println("�������̽��� ���� ����� �����մϴ�.");
		
	}
	@Override
	public void prt2() {
		System.out.println("implements ������ �������̽��� ������ ���� �� �ֽ��ϴ�.");
		
	}
	
}

public class Testingimp  {
	public static void main(String[] args) {
		TestAnIm a = new TestAnIm();
		a.prt1();
	}

}
