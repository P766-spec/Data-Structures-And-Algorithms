import java.util.*;

public class Main {
    public static void main(String[] args) {
        Graphs g = new Graphs(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.printGraph();


    }
}

class Graphs{
    int V;
    LinkedList[] adj;
    Graphs(int v){
        V = v;
        adj = new LinkedList[v];
        for(int i = 0; i < v; i++){
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w){
        adj[v].add(w);

    }



    void printGraph(){
        for(int i = 0; i < V; i++){
            System.out.println(i + " -> " + adj[i]);
        }
    }
}


