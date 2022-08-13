import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Arrays;

/*
 * 제목 : 좋다
 * -문제-
 * N개의 수 중에서 어떤 수가 다른 수 두 개의 합으로 나타낼 수 있다면 그 수를 “좋다(GOOD)”고 한다.
 * N개의 수가 주어지면 그 중에서 좋은 수의 개수는 몇 개인지 출력하라.
 * 수의 위치가 다르면 값이 같아도 다른 수이다.
 */
public class pro1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        long[] arr = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);

        for(int i = 0; i < N; i++) {
            int start_index = 0;
            int end_index = N-1;
            while(start_index < end_index) {
                long sum = arr[start_index] + arr[end_index];
                if(sum == arr[i]) {
                   if(start_index != i && end_index != i) {
                    count++;
                    break;
                   }
                   else if(start_index == i) {
                    start_index++;
                   }
                   else if (end_index == i) {
                    end_index--;
                   }
                }
                else if(sum > arr[i]) {
                    end_index--;
                }
                else start_index++;
            }
        }
        System.out.println(count);
    }
}
