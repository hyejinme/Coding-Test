package Section6;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class S06 {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for(int i=0; i<n; i++) {
            if(arr[i] != tmp[i]) answer.add(i+1);
        }
        return answer;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();

        S06 T = new S06();
        for(int x : T.solution(n, arr)) {
            bw.write(x+" ");
        }

        bw.flush();
        bw.close();
        br.close();
    }



}
