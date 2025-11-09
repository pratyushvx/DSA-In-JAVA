import java.util.*;
 import java.util.LinkedList;

class Classroom{
    static class Edge{
        int source,dest;
        Edge(int s,int d){
            this.source=s;
            this.dest=d;
        }
    }
    public static void bfs(LinkedList<Edge>[] graph){
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[graph.length+4];
        q.add(0);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    } 
    public static void dfs(LinkedList<Edge>[] graph,int curr,boolean vis[]){
        System.out.print(curr +" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph,e.dest,vis);
            }
        }
    }
        public static void main(String args[]){
            int v=7;
            LinkedList<Edge>[] graph=new LinkedList[v];
            for(int i=0;i<v;i++){
                graph[i]=new LinkedList<>();
            }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));
        
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,3));
        
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        
        graph[4].add(new Edge(4,5));
        graph[4].add(new Edge(4,2));
        
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));
        
      
        System.out.print("BFS Traversal:-");
        bfs(graph);
        System.out.println();
        System.out.print("DFS Traversal:-");
        dfs(graph,0,new boolean[v]);
    
}
}
       
