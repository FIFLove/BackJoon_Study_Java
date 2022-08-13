import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
 * 연속된 자연수의 합 구하기
 * 
 * - 문제 -
 * 수 N개 A1, A2, ..., AN이 주어진다. 이때, 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 구하는 프로그램을 작성하시오.
 * 즉, Ai + ... + Aj (i ≤ j) 의 합이 M으로 나누어 떨어지는 (i, j) 쌍의 개수를 구해야 한다.
 */

public class pro2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long sum = 1;
        int count = 0;
        int pl = 1;
        int pr = 1;
        while(pr <= N) {
            if(sum == N) {
                count++;
                pr++;
                sum+=pr;
            }
            else if(sum > N) {
                sum-=pl;
                pl++;                
            }
            else {
                pr++;
                sum+=pr;
            }
        }
        System.out.println(count);
    }
}
