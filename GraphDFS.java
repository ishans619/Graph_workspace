import java.util.ArrayList;

public class GraphDFS {
    public static void DFS(int node, boolean vis[], ArrayList<Integer> ls, ArrayList<ArrayList<Integer>> adj){
        vis[node] = true;
        ls.add(node);

        for(int i : adj.get(node)){
            if(vis[i] == false){
                DFS(i, vis, ls, adj);
            }
        }
    }

    public static ArrayList<Integer> DFSGraph(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> ls = new ArrayList<>();
        boolean vis[] = new boolean[V+1];
        DFS(1, vis, ls, adj);
        return ls;
    }

    public static void main(String [] args){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = 8;

        for(int i = 0 ; i <= V ; i++){
            adj.add(new ArrayList<>());
        }

        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(2).add(5);
        adj.get(2).add(6);
        adj.get(3).add(4);
        adj.get(3).add(7);
        adj.get(4).add(8);
        adj.get(7).add(8);
        
        ArrayList<Integer> newls = DFSGraph(V, adj);

        System.out.print("DFS traversal: ");
        for(int i : newls){
        System.out.print(i + " ");
        }
    }
}
