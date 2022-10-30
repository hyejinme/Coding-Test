package Section3;

import java.io.*;
import java.util.Arrays;

public class S04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String nm = br.readLine();
        int N = Integer.parseInt(nm.split(" ")[0]);
        int M = Integer.parseInt(nm.split(" ")[1]);

        String seqStr = br.readLine();
        int[] seq = Arrays.stream(seqStr.split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        int count = 0;
        int p1=0;

        for(int i=0; i<N; i++) {
            sum += seq[i];
            while (sum >= M){
                if(sum == M) count++;
                sum -= seq[p1++];
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();

    }
}
