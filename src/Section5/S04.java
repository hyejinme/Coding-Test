package Section5;

import java.io.*;
import java.util.Stack;

public class S04 {
    public int solution(String str){
        Stack<Integer> stack = new Stack<>();

        for(char x : str.toCharArray()) {
            if(Character.isDigit(x)) stack.push(x - 48);
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(x == '+') stack.push(lt + rt);
                else if(x == '-') stack.push(lt - rt);
                else if(x == '*') stack.push(lt * rt);
                else if(x == '/') stack.push(lt / rt);
            }
        }
        return stack.get(0);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        S04 T = new S04();
        bw.write(String.valueOf(T.solution(str)));
        bw.flush();
        bw.close();
        br.close();
    }
}
