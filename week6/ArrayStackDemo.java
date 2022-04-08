package week6;


public class ArrayStackDemo {

	public static void main(String[] args) {
		System.out.println("Array Stack Demo!"); 
		ArrayStack<Integer> list = new ArrayStack<>();
		
		
		LinkedStack<Integer> stack1 = new LinkedStack<>(); // �Ǵ� stack1 = new LinkedStack( );
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		System.out.print("printAll(): "); stack1.printAll();  
		stack1.popAll();
		System.out.println("isEmpty?: " + stack1.isEmpty());
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		stack1.pop();
		stack1.push(40);
		int st = stack1.top();
		System.out.print("printAll(): "); stack1.printAll();
//		System.out.println("pop() " + stack1.pop());
//		System.out.println("pop() " + stack1.pop());
//		System.out.println("pop() " + stack1.pop());
//		System.out.println("pop() " + stack1.pop()); // no effect
//		System.out.println("isEmpty?: " + stack1.isEmpty());
	}
}  // 코드 6-3
