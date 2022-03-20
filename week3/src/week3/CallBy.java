<<<<<<< HEAD
package week3;

public class CallBy {
	public static void SampleAccess(int B[], int n) {
		B[n] = 8;
		n++;
	}
	public static void main(String[] args) {
		int[] a = new int [10];
		a[5] = 7;
		int k = 5;
		
		SampleAccess(a, k);
		for (int i : a) {
			System.out.print(i+ " ");
		}
		System.out.println(k);
	}

}
=======
package week3;

public class CallBy {
	public static void SampleAccess(int B[], int n) {
		B[n] = 8;
		n++;
	}
	public static void main(String[] args) {
		int[] a = new int [10];
		a[5] = 7;
		int k = 5;
		
		SampleAccess(a, k);
		for (int i : a) {
			System.out.print(i+ " ");
		}
		System.out.println(k);
	}

}
>>>>>>> fc0c83dcac41b8c851d2395048c2324bcad97121
