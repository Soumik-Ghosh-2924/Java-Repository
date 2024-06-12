package graph;
import java.util.*;
public class allpathsfromsourcetotarget 
{
	static class Edge
	{
		int source;
		int destination;
		Edge(int s, int d)
		{
			this.source=s;
			this.destination=d;
		}
	}
	
	static void created_G(ArrayList<Edge>a[], int V)
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]=new ArrayList<Edge>();
		}
		
		
		a[0].add(new Edge(0,1));
		a[0].add(new Edge(0,2));
		
		a[1].add(new Edge(1,3));
		a[1].add(new Edge(1,0));
		
		a[2].add(new Edge(2,0));
		a[2].add(new Edge(2,4));
		
		a[3].add(new Edge(3,1));
		a[3].add(new Edge(3,4));
		a[3].add(new Edge(3,5));
		
		a[4].add(new Edge(4,2));
		a[4].add(new Edge(4,3));
		a[4].add(new Edge(4,5));
		
		a[5].add(new Edge(5,3));
		a[5].add(new Edge(5,6));
		
		a[6].add(new Edge(6,5));
	}
	
	
	static void printallpathsfromsrc_to_tar(ArrayList<Edge>g[],int current, boolean []visited, String path, int tar)
	{
		if(current ==tar)
		{
			System.out.println(path+"end");
		}
		
		for(int i=0;i<g[current].size();i++)
		{
			Edge e = g[current].get(i);
			if(visited[e.destination]==false)
			{
				visited[current]=true;
				printallpathsfromsrc_to_tar(g,e.destination,visited, path+e.destination+" ->" , tar);
				visited[current]=false;
			}
		}
			
	}
	
	
	
	
	
	
	public static void main(String args[])
	{
		int vertices=7;
		ArrayList<Edge> g[]=new ArrayList[vertices];
		boolean visited[]= new boolean[vertices];
		created_G(g,vertices);
		String path="";
		int src=2;
		int target=5;
		printallpathsfromsrc_to_tar(g,src,visited,path+"2 ->",target);
	}

}
