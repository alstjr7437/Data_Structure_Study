package report3;

public class LinkedStackDemo {
	
	public static void main(String[] args) {
		System.out.println("Linked Stack Demo!"); 
		LinkedList stack1 = new LinkedList(); // 또는 stack1 = new LinkedStack( );
		stack1.append(10);
		stack1.append(20);
		stack1.append(30);
		stack1.append(40);
		stack1.append(50);
		stack1.append(60);
		stack1.append(70);
		stack1.printAll();
		stack1.printReverse();
		
	}
} // 코드 6-5
