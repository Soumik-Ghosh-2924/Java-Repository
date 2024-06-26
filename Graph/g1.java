package graph;
import java.util.*;
public class g1 
{
	static class Edge
	{
		int src;
		int dest;
		
		public Edge(int s, int d)
		{
			this.src=s;
			this.dest=d;
		}
	}
	
	public static void createGraph(ArrayList<Edge>graph[])
	{
		for(int i=0;i<graph.length;i++)// this loop is necessary since 
			//whenever an array is initialized the array consists
			//of null values , so it is important to initialize using 
			//arraylist.
		{
			graph[i]=new ArrayList<Edge>();
		}
		graph[0].add(new Edge(0,2));
		graph[1].add(new Edge(1,2));
		graph[1].add(new Edge(1,3));
		graph[2].add(new Edge(2,0));
		graph[2].add(new Edge(2,1));
		graph[2].add(new Edge(2,3));
		graph[3].add(new Edge(3,1));
		graph[3].add(new Edge(3,2));
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		int V=4;
		ArrayList<Edge> g[]= new ArrayList[V];
		
		
		System.out.println("The neighbours of two in the graph : ");
		createGraph(g);
		for(int i=0;i<g[2].size();i++)
		{
			Edge e=g[2].get(i);
			System.out.print(e.dest);
		}
		
		System.out.println("The neighbours of one in the graph : ");
		createGraph(g);
		for(int i=0;i<g[1].size();i++)
		{
			Edge e=g[1].get(i);
			System.out.print(e.dest);
		}
		
	}
}
