package week6;

public class InheritedStack<E> extends LinkedList<E> implements StackInterface<E> {	
	public InheritedStack() {
		super();
	}
 
	public void push(E newItem) {
 		add(0, newItem);
 	}
 
 	public E pop() {
 		if (!isEmpty()) {
 			return remove(0);
 		} else return null;
 	}
 		
 	public E top() {
 		return get(0);
 	}
 		
 	public void popAll() {
 		clear();
	}

	/////////////////////////////////////////////
	public void printAll() {
		super.printAll();
	}
} // 코드 6-6
