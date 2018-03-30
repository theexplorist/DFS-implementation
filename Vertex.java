package DepthFirstSearch;

import java.util.ArrayList;

public class Vertex {
	private String name;
	boolean visited;
	ArrayList<Vertex>neighbourList;
	
	public Vertex(String name){
		this.name = name;
		this.neighbourList = new ArrayList();
	}
	
	public void addNeighbour(Vertex vertex){
		this.neighbourList.add(vertex); 
	}
	
	public String toString(){
		return this.name;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public ArrayList<Vertex> getNeighbourList() {
		return neighbourList;
	}

	public void setNeighbourList(ArrayList<Vertex> neighbourList) {
		this.neighbourList = neighbourList;
	}
	
	
}
