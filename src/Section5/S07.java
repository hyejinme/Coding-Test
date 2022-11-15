package Section5;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class S07 {
    public String solution(String n, String p) {
        Queue<Character> queue = new LinkedList<>();
        for(char x : n.toCharArray()){
            queue.offer(x);
        }
        for(char x : p.toCharArray()) {
            if(queue.contains(x)){
                if(x != queue.poll()) return "NO";
            }
        }
        if(!queue.isEmpty()) return "NO";

        return "YES";
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String n = br.readLine();
        String p = br.readLine();
        S07 T = new S07();
        bw.write(T.solution(n, p));
        bw.flush();
        bw.close();
        br.close();
    }
}
