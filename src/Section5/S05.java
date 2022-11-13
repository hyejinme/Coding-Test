package Section5;

import java.io.*;
import java.util.Stack;

public class S05 {
    public int solution(String str) {
        int result = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '(') stack.push('(');
            else {
                stack.pop();
                if(str.charAt(i-1) == '(') result += stack.size();
                else result++;
            }
        }

        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        S05 T = new S05();
        bw.write(String.valueOf(T.solution(str)));
        bw.flush();
        bw.close();
        br.close();
    }
}
