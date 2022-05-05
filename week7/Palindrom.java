package week7;
import week7.LinkedStack;

public class Palindrom {
	private static boolean isPalindrom(String A) {
		LinkedStack s = new LinkedStack();
		LinkedQueue q = new LinkedQueue();
		for(int i=0; i < A.length(); i++) {
			s.push(A.charAt(i));   // 문자열 A의 i번째 문자
			q.enqueue(A.charAt(i));
		}
		while(!s.isEmpty() && s.pop() == q.dequeue()) {
		}
		if(s.isEmpty()) return true; 
		else return false;
	}
	
	public static void main(String[] args) {
		System.out.println("Palindrom Check!");
		String str = "lioninoil";   // 테스트 문자열
		boolean t = isPalindrom(str);
		System.out.println(str + " is Palindrom?: " + t);
	}
} // 코드 7-9