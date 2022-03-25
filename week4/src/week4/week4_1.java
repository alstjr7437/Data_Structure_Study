package week4;

import java.util.Scanner;

public class week4_1 {
	public static void arrDel(int[] tempArr, int k) {
		int i;
		for (i = k; i < tempArr.length -1; i++) {
			tempArr[k] = tempArr[k+1];
		}
		tempArr[i] = 0;
	}
	public static void arrIns(int[] tempArr, int k, int val) {
		int i;
		for(i = tempArr.length-1; i > k; i--) {
			tempArr[i] = tempArr[i-1];
		}
		tempArr[i] = val;
	}
	
	public static void main(String[] args) {
//		int[] arr1;
//		arr1 = new int[5];
//		int arr1[] = new int[5];	
		Scanner scn = new Scanner(System.in);
		int arr1[] = {10,20,30,40,50}, i, idx, value;
		
		System.out.println("삽입할 index 입력 : ");
		idx = scn.nextInt();
		System.out.println("삽입할 value 입력 : ");
		value = scn.nextInt();
		arrIns(arr1, idx, value);
		
//		System.out.println("삭제할 index 입력 : ");
//		int idx = scn.nextInt();
//		arrDel(arr1, idx);
		
		for(int j = 0; j < arr1.length; j++) {
			System.out.println(arr1[j]);
		}
		
	}
}
