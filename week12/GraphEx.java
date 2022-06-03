package week12;

class AdjMatrix {
	private int matrix[][] = new int [10][10];
	private int totalV = 0;
	
	public void insertVertex() {
		totalV++;
	}
	public void insertEdge(int v1, int v2) {
		if(v1 >= totalV || v2 >= totalV)
			System.out.println("그래프에 없는 정점입니다.");
		else 
			matrix[v1][v2] = 1;	
	}
	public void printMatrix() {
		for(int i = 0; i < totalV; i++) {
			System.out.printf("\n\t\t");
			for(int j = 0; j < totalV; j++){
				System.out.printf("%3d", matrix[i][j]);
			}
		}
	}
}

class GraphNode {
	int vertex;
	GraphNode link;
}
class AdjList{
	private GraphNode[] head = new GraphNode[10];
	private int totalV = 0;
	
	public void insertVertex() {
		totalV++;
	}
	public void insertEdge(int v1, int v2) {
		if(v1 >= totalV || v2 >= totalV)
			System.out.println("그래프에 없는 정점입니다.");
		else {
			GraphNode gNode = new GraphNode();
			gNode.vertex = v2;
			gNode.link = head[v1];
			head[v1] = gNode;
		}
	}
	public void printAdjList() {
		GraphNode gNode = new GraphNode();
		for(int i = 0; i < totalV; i++) {
			System.out.printf("\n정점 %c의 인접리스트 ", i + 65);
			gNode = head[i];
			while(gNode != null) {
				System.out.printf("-->%c", gNode.vertex + 65);
				gNode = gNode.link;
			}
		}
	}
}
public class GraphEx {	

	public static void main(String[] args) {
			AdjMatrix mgl = new AdjMatrix();
			for(int i = 0; i < 4; i++)
				mgl.insertVertex();
			mgl.insertEdge(0, 3);
			mgl.insertEdge(0, 1);
			mgl.insertEdge(1, 3);
			mgl.insertEdge(1, 2);
			mgl.insertEdge(1, 0);
			mgl.insertEdge(2, 3);
			mgl.insertEdge(2, 1);
			mgl.insertEdge(3, 2);
			mgl.insertEdge(3, 1);
			mgl.insertEdge(3, 0);
			System.out.printf("\n그래프 G1의 인접행렬");
			mgl.printMatrix();
			

			AdjList lgl = new AdjList();
			for(int i = 0; i < 4; i++)
				lgl.insertVertex();
			lgl.insertEdge(0, 3);
			lgl.insertEdge(0, 1);
			lgl.insertEdge(1, 3);
			lgl.insertEdge(1, 2);
			lgl.insertEdge(1, 0);
			lgl.insertEdge(2, 3);
			lgl.insertEdge(2, 1);
			lgl.insertEdge(3, 2);
			lgl.insertEdge(3, 1);
			lgl.insertEdge(3, 0);
			System.out.printf("\n그래프 G1의 인접행렬");
			lgl.printAdjList();
			System.out.println();

	}

}
