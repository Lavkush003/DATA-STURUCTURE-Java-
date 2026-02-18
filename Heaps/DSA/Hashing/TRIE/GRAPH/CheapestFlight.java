
import java.util.*;


public class CheapestFlight{
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int wt){
            this.src=s;
            this.dest=d;
            this.wt=wt;
        }

    }

    public static void createGraph(int flights[][], ArrayList<Edge> graph[]){

        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        for(int i=0;i<flights.length;i++){
            int src=flights[i][0];
            int dest=flights[i][1];
            int wt=flights[i][2];

        }

    }

    public static void main(String args[]){
        int n=4;
        int flights[][]={{0,1,100},{1,2,100},{2,0,100}, {1,3,600},{2,3,200}};
        int src=0, dst=3,k=1;
    }
}
