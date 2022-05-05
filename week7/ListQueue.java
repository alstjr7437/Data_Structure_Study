package week7;
import week7.ArrayList;
import week7.ListInterface;

public class ListQueue<E> implements QueueInterface<E> {
	private ListInterface<E> list;
	
	public ListQueue() {
		list = new ArrayList<E>();
	}
	
	public void enqueue(E newItem) {
		list.append(newItem);
	}
 
	public E dequeue() {
		return list.remove(0);
	}
	
//	public int front(){
//		return list.get(0);
//	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void dequeueAll() {
		list.clear();
	} 
	
	////////////////////////////////////
//	public void printAll() {
//		list.printAll();
//	}
} // 코드 7-7
