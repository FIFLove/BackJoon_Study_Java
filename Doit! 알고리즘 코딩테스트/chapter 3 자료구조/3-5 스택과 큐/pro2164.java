import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class pro2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> myQueue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        for(int i = 1; i <=N; i++) {
            myQueue.add(i);
        }

        int ans = myQueue.poll();
        while(!myQueue.isEmpty()) {
            myQueue.add(myQueue.poll());
            ans = myQueue.poll();
        }
        System.out.println(ans);
    }
}
