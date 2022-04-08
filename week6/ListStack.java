package week6;

public class ListStack<E> implements StackInterface<E> {
	private ListInterface<E> list;

	public ListStack() {
		list = new LinkedList<E>();
	}

	public void push(E newItem) {
		list.add(0, newItem);;
	}
	
	public E pop() {
		return list.remove(0);
	}
 
	public E top() {
		return list.get(0);
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public void popAll() {
		list.clear();
	}

	//////////////////////////////
	public void printAll() {
//		list.printAll();
	}
} // 코드 6-7
