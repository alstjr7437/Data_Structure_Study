package week7;

import java.util.ArrayDeque;
import java.util.Deque;

class w {
    
    public static void main(String[] args) throws InterruptedException {
      
        System.out.println("Stack!!");	//스택!!
        Deque<String> stack = new ArrayDeque<>();	//스택 deque로 만들기
        stack.addFirst("Element1");	//요소 추가하기
        stack.addFirst("Element2");	//요소 추가하기
        stack.addFirst("Element3");	//요소 추가하기
        System.out.println(stack);
        System.out.println(stack.removeFirst());	//스택이므로 첫번째 요소 지우기
        System.out.println(stack.removeFirst());	//스택이므로 첫번째 요소 지우기
        System.out.println(stack.removeFirst());	//스택이므로 첫번째 요소 지우기
        
        System.out.println("Queue!!");	//큐!!
        Deque<String> queue = new ArrayDeque<>();	//큐 deque로 만들기
        queue.addFirst("Element1");	//요소 추가하기
        queue.addFirst("Element2");	//요소 추가하기
        queue.addFirst("Element3");	//요소 추가하기
        System.out.println(queue.removeLast());		//큐이므로 마지막 요소 지우기
        System.out.println(queue.removeLast());		//큐이므로 마지막 요소 지우기
        System.out.println(queue.removeLast());		//큐이므로 마지막 요소 지우기
    }
}