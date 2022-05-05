package week7;

public interface QueueInterface<E> {
	public void enqueue(E x);
	public E dequeue();
	public E front();
	public boolean isEmpty();
	public void dequeueAll();
}  // 코드 7-1
