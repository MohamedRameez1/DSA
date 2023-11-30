package Graph.util;

import Graph.Graph1;

public class Main {

	public static void main(String[] args) {
	
			
			// create on object of graph class
			int novertces =5;
			int noEdges =8;
			Graph1 g = new Graph1(novertces,noEdges);
			
			// create graph
			g.edge[0].src =1;    // edge 1---2
			g.edge[0].dest =2;  
			
			g.edge[1].src =1;    // edge 1---3
			g.edge[1].dest =3;
			
			g.edge[2].src =1;    // edge 1---4
			g.edge[2].dest =4;
			
			
			g.edge[1].src =2;    // edge 2---3
			g.edge[1].dest =3;
			
			g.edge[3].src =2;    // edge 2---4
			g.edge[3].dest =4;
			
		   
			
			g.edge[4].src =2;    // edge 2---5
			g.edge[4].dest =5;
			
			g.edge[5].src =3;    // edge 3---4
			g.edge[5].dest =4;
			
			g.edge[6].src =3;    // edge 3---5
			g.edge[6].dest =5;
			
			g.edge[7].src =4;    // edge 4---5
			g.edge[7].dest =5;
			
			
			// print graph
			for(int i=0;i<noEdges;i++) {
				System.out.println(g.edge[i].src +"-"+g.edge[i].dest);
			}
		}


}
