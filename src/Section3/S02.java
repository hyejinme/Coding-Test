package Section3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class S02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String aStr = br.readLine();
        int[] aArr = Arrays.stream(aStr.split(" ")).mapToInt(Integer::parseInt).toArray();

        int M = Integer.parseInt(br.readLine());
        String bStr = br.readLine();
        int[] bArr = Arrays.stream(bStr.split(" ")).mapToInt(Integer::parseInt).toArray();


        ArrayList<Integer> answer = new ArrayList<>();

        Arrays.sort(aArr);
        Arrays.sort(bArr);

        int p1 = 0;
        int p2 = 0;

        while (p1<N && p2<M){
            if(aArr[p1] == bArr[p2]) {
                answer.add(aArr[p1++]);
                p2++;
            } else if(aArr[p1] < bArr[p2]) p1++;
            else p2++;
        }


        for(Integer num : answer) bw.write(num + " ");

        bw.flush();
        bw.close();
        br.close();
    }
}
