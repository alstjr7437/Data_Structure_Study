package week7;

// 연결 리스트 클래스 LinkedList<E> 상속받기
public class InheritedQueue<E> extends LinkedList<E> implements QueueInterface<E> {
	public InheritedQueue() {
		super();
	}

	public void enqueue(E newItem) {
		append(newItem);
	}

	public E dequeue() {
		return remove(0);
	}

	public E front() {
		return get(0);
	}

	public void dequeueAll() {
		clear();
	}
	
} // 코드 7-6