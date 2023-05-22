import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int V = Integer.parseInt(stringTokenizer.nextToken());
        A = new ArrayList[N+1];
        visited = new boolean[N+1];

        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(stringTokenizer.nextToken());
            int E = Integer.parseInt(stringTokenizer.nextToken());
            A[S].add(E);
            A[E].add(S);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(A[i]);
        }

        DFS(V);
        System.out.println();
        visited = new boolean[N+1];
        BFS(V);


    }

    private static void BFS(int v) {
        if (visited[v]) return;
       Queue<Integer> queue = new LinkedList<>();
       queue.offer(v);
       visited[v] = true;
        System.out.print(v+" ");
       while(!queue.isEmpty()){
           int now = queue.poll();
           for (int i : A[now]) {
               if (!visited[i]) {
                   visited[i] = true;
                   queue.offer(i);
                   System.out.print(i+" ");
               }
           }
       }


    }

    private static void DFS(int v) {
        if(visited[v]) return;
        visited[v] = true;
        System.out.print(v+" ");
        for (int i : A[v]) {
            DFS(i);
        }
    }

}
