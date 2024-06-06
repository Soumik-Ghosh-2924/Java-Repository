package graph;
import java.util.*;
public class g2 
{
	static class Edge //this should be static for a graph since it remains same all throughout the graph structure 
	{
		int src;
		int dest;
		int weight;
		public Edge(int s, int d, int w)
		{
			this.src=s;
			this.dest=d;
			this.weight=w;
		}
	}
	
	
	static void createGraph(ArrayList<Edge>graph[])
	{
		for(int i=0;i<graph.length;i++)
		{
			graph[i]= new ArrayList<Edge>();
		}
		
		graph[0].add(new Edge(0,2,2));
		graph[2].add(new Edge(2,0,2));
		graph[2].add(new Edge(2,3,-1));
		graph[2].add(new Edge(2,1,10));
		graph[3].add(new Edge(3,2,-1));
		graph[3].add(new Edge(3,1,0));
		graph[1].add(new Edge(1,2,10));
		graph[1].add(new Edge(1,3,0));
		
	}
	
	public static void main(String args[])
	{
		int Vertices=4;
		ArrayList<Edge>g[]= new ArrayList[Vertices];
		createGraph(g);
		
		System.out.println("The neighbours of 2 and their weights are : ");
		for(int i=0;i<g[2].size();i++)
		{
			Edge e =g[2].get(i);
			System.out.println(e.dest + " , " + e.weight);
		}
	}

}
