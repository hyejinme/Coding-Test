package Section4;

import java.io.*;
import java.util.HashMap;

public class S04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String[] sArr = s.split("");
        String t = br.readLine();

        HashMap<String, Integer> hashMap = new HashMap<>();
        for(int i=0; i<t.length()-1; i++) {
            hashMap.put(sArr[i], hashMap.getOrDefault(sArr[i], 0) + 1);
        }

        //비교용 해시맵 선언
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        for(String str : t.split("")){
            hashMap2.put(str, hashMap2.getOrDefault(str, 0) + 1);
        }
        //

        int count = 0;

        int lt = 0;
        for(int rt = t.length() - 1; rt<s.length(); rt++){
            hashMap.put(sArr[rt], hashMap.getOrDefault(sArr[rt], 0) + 1);
            if(hashMap.equals(hashMap2)) count++;
            hashMap.put(sArr[lt], hashMap.get(sArr[lt]) -1);
            if(hashMap.get(sArr[lt]) == 0){
                hashMap.remove(sArr[lt]);
            }
            lt++;
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
