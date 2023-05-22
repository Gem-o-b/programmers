import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] visited ;
    static int[][] A;
    static int[] way = {-1,0,1,0};
    static int[] way2 = {0,-1,0,1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        A = new int [N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            int[] tmp = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < M; j++) {
                A[i][j] = tmp[j];
                if (tmp[j] == 0 ) visited[i][j] = true;

            }
        }
        visited[0][0] = true;
        BFS(0,0);
        System.out.println(A[N-1][M-1]);
    }

    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i,j});

        while(!queue.isEmpty()){
            int[] now = queue.poll();
            for (int k = 0; k < 4; k++) {
                int x = now[0]+way[k];
                int y = now[1]+way2[k];
                if (x < 0 || y < 0 || x >= A.length || y >= A[i].length) continue;
                if (A[x][y] != 0 && !visited[x][y]){
                    if (visited[x][y]) continue;
                    queue.offer(new int[] {x,y});
                    A[x][y] = A[now[0]][now[1]]+1;
                    visited[x][y] = true;
                }
            }
        }
    }
}
