import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;

public class pro2023 {
    static Queue<Integer> A;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        A = new LinkedList<>();
        A.offer(2);
        A.offer(3);
        A.offer(5);
        A.offer(7);
        BFS(1);
        for(int i : A){
            System.out.println(i);
        }
    }
    public static void BFS(int depth)
    {
        if(depth == N) return;
        Queue<Integer> B = new LinkedList<>();
        for(int i : A) {
            for(int j = 1; j < 10; j+= 2) {
                int c = i * 10 + j;
                if(prime(c)) {
                    B.offer(c);
                }
            }
        }
        A = new LinkedList<>(B);
        BFS(depth+1);
    }
    public static boolean prime(int a){
        if (a == 1) return false;
        if (a == 2) return true;
        if (a % 2 == 0) return false;
        for(int i = 3; i < a / 2; i += 2) {
            if(a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
