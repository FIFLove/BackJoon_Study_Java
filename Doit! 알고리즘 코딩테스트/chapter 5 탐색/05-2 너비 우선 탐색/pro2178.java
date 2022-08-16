import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;

public class pro2178 {
    static int[] dx = { 0, 1, 0, -1};
    static int[] dy = { 1, 0, -1, 0};
    static int N;
    static int M;
    static boolean[][] visited;
    static int[][] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new int[N][M];
        visited = new boolean[N][M];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for(int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(str.substring(j, j+1));
            }
        }
        BFS(0,0);
        System.out.println(A[N-1][M-1]);
    }

    public static void BFS(int x_index, int y_index) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x_index, y_index});
        visited[x_index][y_index] = true;
        while(!queue.isEmpty()){
            int[] xy = queue.poll();
            for(int i = 0; i < 4; i++) {
                int x = xy[0] + dx[i];
                int y = xy[1] + dy[i];
                if(x >= 0 && y >= 0 && x < N && y < M){
                    if((!visited[x][y]) && A[x][y] != 0) {
                        A[x][y] = A[xy[0]][xy[1]] + 1;
                        queue.offer(new int[] {x, y});
                        visited[x][y] = true;
                    }
                }
            }
        }
    }

}
