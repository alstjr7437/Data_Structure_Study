package week9;

public class LinkedTreeTest {
	public static void main(String[] args) {
		LinkedTree bt = new LinkedTree();
		TreeNode n7 = bt.makeBt(null, 'D' , null);
		TreeNode n6 = bt.makeBt(null, 'C' , null);
		TreeNode n5 = bt.makeBt(null, 'B' , null);
		TreeNode n4 = bt.makeBt(null, 'A' , null);
		TreeNode n3 = bt.makeBt(n6, '/' , n7);
		TreeNode n2 = bt.makeBt(n4, '*' , n5);
		TreeNode n1 = bt.makeBt(n2, '-' , n3);
		
		System.out.printf("PreOrder \t >>>> \t ");
		bt.preorder(n1);
		System.out.printf("\nInOrder \t >>>> \t");
		bt.inorder(n1);
		System.out.printf("\nPostOrder \t >>>> \t");
		bt.postorder(n1); 
	}
}
