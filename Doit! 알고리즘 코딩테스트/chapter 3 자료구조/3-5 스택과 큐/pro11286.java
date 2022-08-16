import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.PriorityQueue;

public class pro11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1, o2) -> {
            int x = Math.abs(o1);
            int y = Math.abs(o2);
            if(x == y) return o1 > o2 ? 1 : -1;
            else return x - y;
        });
        for(int i = 0; i < N; i++) {
            int A = Integer.parseInt(br.readLine());
            if(A == 0) {
                if(myQueue.isEmpty()) System.out.println(0);
                else System.out.println(myQueue.poll());
            }
            else myQueue.add(A);
        }
    }
}
