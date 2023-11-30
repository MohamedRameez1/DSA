package Graph;

public class DFSmain {

			public static void main(String[] args) {
				ExampleDFS g= new ExampleDFS(6);
				g.addEdge(0,1);
				g.addEdge(0,2);
				g.addEdge(1,0);
				g.addEdge(1,3);
				g.addEdge(2,0);
				g.addEdge(2,3);
				g.addEdge(3,4);
				g.addEdge(3,5);
				g.addEdge(4,1);
				g.addEdge(4,3);
				g.addEdge(5, 3);	
				System.out.println("Following is DFS");
                g.DFS(0);
	

}
}
