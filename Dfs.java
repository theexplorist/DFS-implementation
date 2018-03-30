package DepthFirstSearch;

import java.util.ArrayList;
import java.util.Stack;

public class Dfs {

	Stack stack;

	public Dfs() {
		this.stack = new Stack<>();
	}

	public void DFS(ArrayList<Vertex> vertexlist) {
		for (Vertex v : vertexlist) {
			if (!v.isVisited()) {
				v.setVisited(true);
				//dfsWithStack(v);
				dfsRecursive(v);
			}
		}
	}

	public void dfsRecursive(Vertex v){
		
		System.out.println(v + " ");
		for(Vertex v1 : v.getNeighbourList()){
			if(!v1.isVisited()){
				v1.setVisited(true);
				dfsRecursive(v1);
			}
		}
	}
	public void dfsWithStack(Vertex v) {
		// TODO Auto-generated method stub
		this.stack.push(v);
		v.setVisited(true);

		while (!this.stack.isEmpty()) {
			Vertex actuaV = (Vertex) this.stack.pop();
		    System.out.println(actuaV + " ");
		    for(Vertex v1 : actuaV.getNeighbourList()){
		    	if(!v1.isVisited()){
		    		v1.setVisited(true);
		    		this.stack.push(v1);
		    	}
		    }
		}
	}
}
