import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Arrays;

public class pro1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int start_index = 0;
        int end_index = N-1;
        int count = 0;
        while(end_index != start_index) {
            long sum = arr[start_index] + arr[end_index];
            if(sum == M) {
                count++;
                end_index--;
            }
            else if(sum < M) {
                start_index++;
            }
            else {
                end_index--;
            }
        }
        System.out.println(count);
    }
}
