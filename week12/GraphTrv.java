package week12;

class StackNode{
   int data;
   StackNode link;
}

class LinkedStack{
   StackNode top;
   public boolean isEmpty() {
      return (top == null); //top가 null값인지 check
   }
   public void push(int item) {
      StackNode newNode = new StackNode();
      newNode.data = item;
      newNode.link = top;
      top = newNode;
   }
   
   public int pop() {
      if(isEmpty()) {
         System.out.println("삭제 실패! 링크스택이 비어있음");
         return 0;
   } else {
      int item = top.data;
      top = top.link;
      return item;
      }
   }
}


class QNode{
   int data;
   QNode link;
   
}

class LinkedQueue{
   QNode front, rear;
   public LinkedQueue() {
      front = rear = null;
   }
   
   public boolean isEmpty() {
      return (front == null);
   }
   
   public void enQueue(int item) {
      QNode newNode = new QNode();
      newNode.data = item;
      newNode.link = null;
      if(isEmpty())
         front = rear = newNode;
      else {
         rear.link = newNode;
         rear = newNode;
      }
   }
   public int deQueue() {
      if(isEmpty()) {
         System.out.println("삭제 실패");
         return 0;
      }else {
         int item = front.data;
         front = front.link;
         if(front == null)
            rear = null;
         return item;
      }
   }
}
class GraphNode2{
	int vertex;
	GraphNode2 link;
}
class AdjList2 {
	private GraphNode2[] head = new GraphNode2[10];
	private int totalV = 0;
	public void insertVertex() {
		totalV++;
	}
	public void insertEdge(int v1, int v2) {
		if(v1 >= totalV || v2 >= totalV)	
			System.out.println("그래프에 없는 정점입니다.");
		else {
			GraphNode2 gNode = new GraphNode2();
			gNode.vertex = v2;
			gNode.link = head[v1];
			head[v1] = gNode;
		}
	}
	public void printAdjList() {
		GraphNode2 gNode = new GraphNode2();
		for(int i = 0; i < totalV; i++) {
			System.out.printf("\n정점 %c의 인접리스트 ", i + 65);
			gNode = head[i];
			while(gNode != null) {
				System.out.printf("-->%c", gNode.vertex + 65);
				gNode = gNode.link;
			}
		}
	}
	public void DFS(int v) {
		GraphNode2 w = new GraphNode2();
		LinkedStack s = new LinkedStack();
		boolean visited[] = new boolean[10];
		
		s.push(v);
		visited[v] = true;
		System.out.printf(" %c", v + 65);
		while(s.top != null) {
			w = head[v];
			while(w != null) {
				if(visited[w.vertex] == false) {
					s.push(w.vertex);
					visited[w.vertex] = true;
					System.out.printf(" %c", w.vertex + 65);
					v = w.vertex;
					w = head[v];
				}
				else 
					w = w.link;
			}
			v = s.pop();
		}
	}
	public void BFS(int v) {
		GraphNode2 w = new GraphNode2();
		LinkedQueue q = new LinkedQueue();
		boolean[] visited = new boolean[10];
		visited[v] = true;
		System.out.printf(" %c", v + 65);
		q.enQueue(v);
		while(!q.isEmpty()) {
			v = q.deQueue();
			for(w= head[v]; w != null; w = w.link) {
				if(visited[w.vertex] == false) {
					visited[w.vertex] = true;
					System.out.printf(" %c", w.vertex + 65);
					q.enQueue(w.vertex);
				}
			}
		}
	}
}


public class GraphTrv {
   public static void main(String args[]) {
      AdjList2 g9 = new AdjList2();
      for(int i = 0; i < 7; i++) 
    	  g9.insertVertex();
      g9.insertEdge(0, 2);
      g9.insertEdge(0, 1);
      g9.insertEdge(1, 4);
      g9.insertEdge(1, 3);
      g9.insertEdge(2, 4);
      g9.insertEdge(2, 0);
      g9.insertEdge(3, 6);
      g9.insertEdge(3, 1);
      g9.insertEdge(4, 6);
      g9.insertEdge(4, 2);
      g9.insertEdge(4, 1);	
      g9.insertEdge(5, 6);
      g9.insertEdge(6, 5);
      g9.insertEdge(6, 4);
      g9.insertEdge(6, 3);
      System.out.printf("\n그래프 g9의 인접리스트 : ");
      g9.printAdjList(); System.out.println();
      
      System.out.printf("\n\n깊이 우선 탐색");
      g9.DFS(0);

      System.out.printf("\n\n너비 우선 탐색");
      g9.BFS(0);
   }
}