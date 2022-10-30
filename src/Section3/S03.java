package Section3;

import java.io.*;
import java.util.Arrays;

public class S03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String nk = br.readLine();
        int N = Integer.parseInt(nk.split(" ")[0]);
        int K = Integer.parseInt(nk.split(" ")[1]);

        String money = br.readLine();
        int[] moneyArr = Arrays.stream(money.split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxSum = 0;

        // 배열이 [1,2,3,4]일 때
        //0~K-1(2)까지의 maxSum은 6
        for(int i=0; i<K; i++){
            maxSum += moneyArr[i];
        }
        int answer = maxSum;

        // maxSum에 K(3) 요소를 더하고 i-K(3-3) 요소를 빼면
        // 뒤의 요소 하나가 더해지고, 맨 앞에 있는 요소가 빠짐 -> 슬라이딩 윈도우
        for(int i=K; i<N; i++){
           maxSum += moneyArr[i] - moneyArr[i-K];
           answer = Math.max(answer, maxSum);
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
