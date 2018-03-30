package DepthFirstSearch;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		
		Dfs dfs = new Dfs();
		Vertex v1 = new Vertex("A");
		Vertex v2 = new Vertex("B");
		Vertex v3 = new Vertex("C");
		Vertex v4 = new Vertex("D");
		Vertex v5 = new Vertex("E");
		Vertex v6 = new Vertex("F");
        Vertex v7 = new Vertex("G");
        Vertex v8 = new Vertex("H");
		v1.addNeighbour(v2);
		v1.addNeighbour(v3);
		v2.addNeighbour(v4);
		v2.addNeighbour(v5);
		v3.addNeighbour(v5);
		v4.addNeighbour(v6);
		v4.addNeighbour(v5);
		v5.addNeighbour(v6);
		v7.addNeighbour(v8);
		ArrayList list = new ArrayList<>();
		
		list.add(v1);
//		list.add(v2);
//		list.add(v3);
//		list.add(v4);
//		list.add(v5);
//		list.add(v6);
		list.add(v7);
		//dfs.DFS(list);
//		dfs.dfsWithStack(v1);;

		
		dfs.DFS(list);
		
	}
}
