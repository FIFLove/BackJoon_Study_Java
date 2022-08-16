import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class pro12891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        char[] DNA = br.readLine().toCharArray();
        int[] ACGT = new int[4];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 4; i++) {
            ACGT[i] = Integer.parseInt(st.nextToken());
        }

        long[][] ACGTsum = new long[S + 1][4];
        for(int i = 1; i <= S; i++) {
            ACGTsum[i] = ACGTsum[i-1].clone();
            switch(DNA[i-1]) {
                case 'A' :
                    ACGTsum[i][0]++;
                    break;
                case 'C' :
                    ACGTsum[i][1]++;
                    break;
                case 'G' :
                    ACGTsum[i][2]++;
                    break;
                case 'T' :
                    ACGTsum[i][3]++;
                    break;
            }
        }

        int answer = 0;
        for(int i = 0; i <= S-P; i++) {
            long[] newACGT = new long[4];
            int count = 0;
            for(int j = 0; j < 4; j++) {
                newACGT[j] = ACGTsum[i+P][j]-ACGTsum[i][j];
                if(newACGT[j] >= ACGT[j]) count++;
            }
            if(count == 4) answer++;
        }
        System.out.println(answer);
    }
}
