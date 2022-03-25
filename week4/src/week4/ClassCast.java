package week4;
class Animal<I> {
	int a;
	void eat() {
		System.out.println("냠");
	}
}

class Cat extends Animal{
	int b;
	void meow() {
		System.out.println("냐옹");
	}
}


public class ClassCast {
	public static void main(String[] args) {
		Animal<Integer> an = new Animal();
		an.eat();
		Cat cat = new Cat();
		cat.eat(); cat.meow();
		Animal an2 = new Cat();			//Cat an3 = new Animal();은 오류가 남
		an2.eat();		//부모 메소드만 가능
		Cat cat2 = (Cat)an2;
		cat2.meow();
		
		
	}
}
