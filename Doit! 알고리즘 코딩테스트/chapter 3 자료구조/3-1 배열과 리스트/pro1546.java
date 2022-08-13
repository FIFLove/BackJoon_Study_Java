import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class pro1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] x = new int[N];
        int M = 0;
        long sum = 0;
        for(int n = 0; n < N; n++) {
            x[n] = Integer.parseInt(st.nextToken());
            if(M < x[n]) M  = x[n];
            sum+=x[n];
        }

        System.out.println(sum * 100.0 / M / N);
    }
}
