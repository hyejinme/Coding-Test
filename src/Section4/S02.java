package Section4;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class S02 {
    public String Solution(String str1, String str2){
        Map<Character, Integer> map = new HashMap<>();

        for(char c : str1.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> map2 = new HashMap<>();

        for(char c : str2.toCharArray()){
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        for(char key : map.keySet()){
            if(!map.get(key).equals(map2.get(key))) {
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        String str2 = br.readLine();
        S02 T = new S02();

        bw.write(T.Solution(str1, str2));
        bw.flush();
        bw.close();
        br.close();
    }
}
