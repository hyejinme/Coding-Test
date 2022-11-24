package Section6;

import java.io.*;
import java.util.Arrays;

public class S05 {

    public String solution(int n, int[] arr) {
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++) {
            if(arr[i] == arr[i+1]) return "D";
        }
        return "U";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();

        S05 T = new S05();
        bw.write(T.solution(n, arr));

        bw.flush();
        bw.close();
        br.close();
    }


}
