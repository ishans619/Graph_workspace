import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class GraphBFS {

    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> BFS = new ArrayList<>();
        boolean vis[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0);
        vis[0] = true;

        while(!q.isEmpty()){
            int node = q.poll();
            BFS.add(node);

            for(int i : adj.get(node)){
                if(vis[i] == false){
                    vis[i] = true;
                    q.add(i);
                }
            }
        }
        return BFS;
    }
    public static void main(String [] args){
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0 ; i < V ; i++){
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(2).add(4);

        ArrayList<Integer> bfsTraversal = bfsOfGraph(V, adj);

        System.out.print("BFS Traversal: ");
        for(int node: bfsTraversal){
        System.out.print(node + " ");
        }
    }
}
