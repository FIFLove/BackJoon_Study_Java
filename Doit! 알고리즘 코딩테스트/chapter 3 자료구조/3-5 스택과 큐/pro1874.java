import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class pro1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        int count = 0;
        int s = Integer.parseInt(br.readLine());
        for(int i = 1; i <= N; i++) {
           stack.push(i);
           sb.append('+').append('\n');
           count++;
           while(!stack.empty() && stack.peek() == s) {
                stack.pop();
                sb.append('-').append('\n');
                count++;
                if(count != N*2) s = Integer.parseInt(br.readLine());
            }
        }
        if(count == N*2) System.out.print(sb);
        else System.out.println("NO");
    }
}
