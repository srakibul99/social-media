/*
 * Written by srakibul99
 */

public class SocialNetwork {
	
	private static UndirectedGraph network;
	
	SocialNetwork()
	{
		network = new UndirectedGraph<>();
	}
	
	 // Adds an edge to an undirected graph 
    static void addEdge(Profile p1, Profile p2) 
    { 
        network.addEdge(p1, p2);
	}

    static void printfriends(Profile p) 
    {        
        for(int i = 0; i < network.getNumberOfEdges(); i++) 
        { 
        network.displayEdges();
        } 
    } 
	
}
	
	