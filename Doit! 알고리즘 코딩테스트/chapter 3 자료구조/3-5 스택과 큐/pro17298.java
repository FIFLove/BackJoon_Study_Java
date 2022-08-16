import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.LinkedList;

public class pro17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        Stack<Integer> myStack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i ++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        int[] Answer = new int[N];
        myStack.push(0);
        for(int i = 1; i < N; i++) {
            while(!myStack.isEmpty()){
                if(A[myStack.peek()] >= A[i]) break;
                else
                    Answer[myStack.pop()] = A[i];
            }
            myStack.push(i);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < N; i++) {
            if(Answer[i] == 0) bw.write(-1 + " ");
            else bw.write(Answer[i] + " ");
        }
        bw.flush();
    }
}
