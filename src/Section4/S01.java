package Section4;

import java.io.*;
import java.util.*;

public class S01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        Map<Character, Integer> map = new HashMap<>();
        for(char x : str.toCharArray()){
            //map.getOrDefault - map에 키가 존재하지 않으면 설정해준 디폴트값 할당
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        char result = ' ';

        for(char key : map.keySet()){
            if(map.get(key) > max) {
                max = map.get(key);
                result = key;
            }
        }

        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}
