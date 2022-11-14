package Section5;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class S06 {
    public int solution(int n, int k) {
        int result = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=n; i++) queue.offer(i);

        while (!queue.isEmpty()) {
            for(int i=1; i<k; i++) queue.offer(queue.poll());
            queue.poll();
            if(queue.size() == 1)  result = queue.poll();
        }

        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String nk = br.readLine();
        int n = Integer.parseInt(nk.split(" ")[0]);
        int k = Integer.parseInt(nk.split(" ")[1]);
        S06 T = new S06();
        bw.write(String.valueOf(T.solution(n, k)));
        bw.flush();
        bw.close();
        br.close();
    }
}
