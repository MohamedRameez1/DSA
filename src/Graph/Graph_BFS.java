package Graph;

import java.util.LinkedList;

public class Graph_BFS {
private int V;
private LinkedList<Integer>adj[];
public Graph_BFS(int v) {
	V=v;
	adj = new LinkedList[v];
	for(int i=0;i<v;++i) {
		adj[i]=new LinkedList();
	}
	queue = new LinkedList<>();
	
}
void addEdge(int v,int w)
{
	adj[v].add(w);
}
void BFS(int n)
{

	boolean  nodes[] = new boolean[V];
	int a =0;
	nodes[n]=true;
	queue.add
}
