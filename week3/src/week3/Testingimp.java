<<<<<<< HEAD
package week3;

class TestAnIm implements Testing{

	@Override
	public void prt1() {
		System.out.println("인터페이스는 다중 상속이 가능합니다.");
		
	}
	@Override
	public void prt2() {
		System.out.println("implements 다음에 인터페이스를 여러개 적을 수 있습니다.");
		
	}
	
}

public class Testingimp  {
	public static void main(String[] args) {
		TestAnIm a = new TestAnIm();
		a.prt1();
	}

}
=======
package week3;

class TestAnIm implements Testing{

	@Override
	public void prt1() {
		System.out.println("인터페이스는 다중 상속이 가능합니다.");
		
	}
	@Override
	public void prt2() {
		System.out.println("implements 다음에 인터페이스를 여러개 적을 수 있습니다.");
		
	}
	
}

public class Testingimp  {
	public static void main(String[] args) {
		TestAnIm a = new TestAnIm();
		a.prt1();
	}

}
>>>>>>> fc0c83dcac41b8c851d2395048c2324bcad97121
