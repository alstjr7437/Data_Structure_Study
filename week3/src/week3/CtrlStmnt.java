package week3;

import java.util.Scanner;

public class CtrlStmnt {

	public static void main(String[] args) {
		outer:
		for (int i = 0; i < 10; i++) {
			inner:
			for (int j = 0; j < 10; j++) {
				if(i + j == 5) {
					break outer;
				}
				System.out.printf("i = %d j = %d  ", i, j);
			}
			System.out.println();
			 
		}

	}

}
