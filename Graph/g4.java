package graph;
import java.util.*;
public class g4 
{
	static class Edge //this should be static for a graph since it remains same all throughout the graph structure 
	{
		int src;
		int dest;
		public Edge(int s, int d)
		{
			this.src=s;
			this.dest=d;
		}
	}
	
	
	static void createGraph(ArrayList<Edge>graph[])
	{
		for(int i=0;i<graph.length;i++)
		{
			graph[i]= new ArrayList<Edge>();
		}
		
		graph[0].add(new Edge(0,1));
		graph[0].add(new Edge(0,2));
		
		graph[1].add(new Edge(1,0));
		graph[1].add(new Edge(1,3));
		
		graph[2].add(new Edge(2,0));
		graph[2].add(new Edge(2,4));
		
		graph[3].add(new Edge(3,1));
		graph[3].add(new Edge(3,4));
		graph[3].add(new Edge(3,5));
		
		graph[4].add(new Edge(4,2));
		graph[4].add(new Edge(4,3));
		graph[4].add(new Edge(4,5));
		
		graph[5].add(new Edge(5,3));
		graph[5].add(new Edge(5,4));
		graph[5].add(new Edge(5,6));
		
		graph[6].add(new Edge(6,5));		
	}
	
	
	public static void BFS(ArrayList<Edge>graph[], int V)
	{
		Queue<Integer> q =new LinkedList<>();
		boolean visited[]= new boolean[V];
		q.add(0);
		
		while(!q.isEmpty())
		{
			int current=q.remove();
			if(visited[current]==false)
			{
				System.out.print(current + " -> ");
				visited[current]=true;
				for(int i=0;i<graph[current].size();i++)
				{
					Edge e = graph[current].get(i);
					q.add(e.dest);
				}
			}
		}
		System.out.println("end");
	}
	
	public static void DFS(ArrayList<Edge>Graph[], int current, boolean [] visited)
	{
		System.out.print(current + " -> ");
		visited[current]=true;
		
		for(int i=0;i<Graph[current].size();i++)
		{
			Edge e= Graph[current].get(i);
			if(visited[e.dest]==false)
			{
				DFS(Graph,e.dest,visited);
			}
		}
	}
	
	
	public static void main(String args[])
	{
		int Vertices=7;
		ArrayList<Edge>g[]= new ArrayList[Vertices];
		createGraph(g);
		boolean visited[]= new boolean[Vertices];
		
		BFS(g,Vertices);
		
		DFS(g,0,visited);
		System.out.println("end");
	}

}
