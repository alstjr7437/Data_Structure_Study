package week3;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.print("이름 입력 : ");
		name = sc.next();
		if(name.equals("홍길동")) {
			System.out.println("맞음");
		}else {
			System.out.println("틀림");
		}

	}

}
