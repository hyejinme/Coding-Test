package Section3;

import java.io.*;
import java.util.Arrays;

public class S06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String nk = br.readLine();

        int n = Integer.parseInt(nk.split(" ")[0]);
        int k = Integer.parseInt(nk.split(" ")[1]);
        String seqStr = br.readLine();
        int[] seq = Arrays.stream(seqStr.split(" ")).mapToInt(Integer::parseInt).toArray();
        int p = 0;
        int count = 0;
        int maxLength = 0;

        for(int i=0; i<n; i++) {
            if(seq[i] == 0) count++;
            while (count > k){
                if(seq[p++] == 0) count--;
            }
            maxLength = Math.max(maxLength, i-p+1);
        }

        bw.write(String.valueOf(maxLength));
        bw.flush();
        bw.close();
        br.close();

    }
}
