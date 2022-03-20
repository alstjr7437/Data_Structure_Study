<<<<<<< HEAD
package week3;

class TestEx{
	int a, b, c;
	public static int d = 0;
	

	public TestEx(int a) {
		this.a = a;
	}	

	public TestEx(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public TestEx(int a, int b, int c) {
		this(a, b);
		this.c = c;
	}

	public int getA() {
		return a;
	}	
	
	public String toString() {
		return "TestEx [a=" + a + ", b=" + b + ", c=" + c + ", getA()=" + getA() + "]";
	}


	public static void hihello() {
		System.out.println("hello, World!!");
	}
}

public class Test {
	static int cnt = 0;
	public static void testtest() {
		System.out.println("testing");
		cnt++;
	}
	public static void main(String[] args) {		//운영체제가 
		
		System.out.println(cnt);
		
		
		
//		TestEx.hihello();
//		System.out.println(TestEx.d);
//		TestEx one = new TestEx(1,2,3);
//		TestEx two = new TestEx(4,5,6);
//		TestEx three = new TestEx(7,8,9);
//		System.out.println(two.a);
//		System.out.println(two);
//		one.d++;
//		System.out.println(two.d);
//		System.out.println(three.d);
	}

}
=======
package week3;

class TestEx{
	int a, b, c;
	public static int d = 0;
	

	public TestEx(int a) {
		this.a = a;
	}	

	public TestEx(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public TestEx(int a, int b, int c) {
		this(a, b);
		this.c = c;
	}

	public int getA() {
		return a;
	}	
	
	public String toString() {
		return "TestEx [a=" + a + ", b=" + b + ", c=" + c + ", getA()=" + getA() + "]";
	}


	public static void hihello() {
		System.out.println("hello, World!!");
	}
}

public class Test {
	static int cnt = 0;
	public static void testtest() {
		System.out.println("testing");
		cnt++;
	}
	public static void main(String[] args) {		//운영체제가 
		
		System.out.println(cnt);
		
		
		
//		TestEx.hihello();
//		System.out.println(TestEx.d);
//		TestEx one = new TestEx(1,2,3);
//		TestEx two = new TestEx(4,5,6);
//		TestEx three = new TestEx(7,8,9);
//		System.out.println(two.a);
//		System.out.println(two);
//		one.d++;
//		System.out.println(two.d);
//		System.out.println(three.d);
	}

}
>>>>>>> fc0c83dcac41b8c851d2395048c2324bcad97121
