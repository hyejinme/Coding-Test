package Section5;

import java.io.*;
import java.util.Stack;

public class S02 {
    public String solution(String str) {
        String result = "";
        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()) {
            if(x == ')') while (stack.pop() != '(');
            else stack.push(x);
        }
        for(Character c : stack) {
            result += c;
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        S02 T = new S02();
        bw.write(T.solution(str));
        bw.flush();
        bw.close();
        br.close();
    }
}
