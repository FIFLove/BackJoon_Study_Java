import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// 숫자의 합 구하기
public class pro11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] c = br.readLine().toCharArray();
        int sum = 0;
        for(int i = 0; i < N; i++){
            sum += c[i] - '0';
        }
        System.out.println(sum);
    }
}
