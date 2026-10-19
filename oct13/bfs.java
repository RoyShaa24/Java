package oct13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    static void bfs(ArrayList<ArrayList<Integer>>graph, int start, int vertices)
    {
        boolean visited[] = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[start]=true;
        queue.add(start);
        while (!queue.isEmpty())
        {
            int current = queue.poll();
            System.out.print(current+"-->");
            for(int neighb:graph.get(current))
            {
                if(visited[neighb] == false)
                {
                    visited[neighb] = true;
                    queue.add(neighb);
                }
            }
        }
    }
    public static void main(String[] args) {
        int vertices=7;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i=0;i<vertices;i++)
        {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(0);
        graph.get(1).add(3);
        graph.get(1).add(4);

        graph.get(2).add(0);
        graph.get(2).add(5);
        graph.get(2).add(6);

        graph.get(3).add(1);
        graph.get(4).add(1);

        graph.get(5).add(2);
        graph.get(6).add(2);

        bfs(graph,0,vertices);
    }
}