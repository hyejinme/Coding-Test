package Section3;

import java.io.*;

public class S05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int p1 = 1;
        int p2 = 2;
        int count = 0;
        int sum = p1+p2;
        while (p1<=N/2 || p2<=N/2) {
            if (sum == N) {
                count++;
                sum -= p1++;
            }
            else if(sum < N) sum += ++p2;
            else sum -= p1++;
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
