package Section5;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }

}
public class S08 {
    public int solution(int n, int m, int[] arr) {
        int answer = 1;
        Queue<Person> queue = new LinkedList<>();
        for(int i=0; i<n; i++) {
            queue.add(new Person(i, arr[i]));
        }
        while (!queue.isEmpty()) {
            Person tmp = queue.poll(); // 큐에서 꺼내 tmp에 저장
            for(Person x : queue) {
                if(x.priority > tmp.priority) { // 꺼낸 환자보다 위험도가 높은 환자가 있으면
                    queue.add(tmp); // 대기목록에 다시 넣음
                    tmp = null;
                    break;
                }
            }
            if(tmp != null) {
                if(tmp.id == m) return answer;
                else answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String nm = br.readLine();
        int n = Integer.parseInt(nm.split(" ")[0]);
        int m = Integer.parseInt(nm.split(" ")[1]);
        String p = br.readLine();
        int[] arr = Arrays.stream(p.split(" ")).mapToInt(Integer::parseInt).toArray();

        S08 T = new S08();
        bw.write(String.valueOf(T.solution(n, m, arr)));
        bw.flush();
        bw.close();
        br.close();
    }
}
