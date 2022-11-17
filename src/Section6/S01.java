package Section6;

import java.io.*;
import java.util.Arrays;

//선택 정렬
public class S01 {
    public int[] solution(int n, int[] arr) {
        for(int i=0; i<n-1; i++) {
            int idx = i;
            for(int j=i+1; j<n; j++) {
                if(arr[j] < arr[idx]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();

        S01 T = new S01();
        for(int result : T.solution(n, arr)) {
            bw.write(result + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
