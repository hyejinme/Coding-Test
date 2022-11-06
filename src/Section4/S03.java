package Section4;

import java.io.*;
import java.util.*;

public class S03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String nk = br.readLine();
        int n = Integer.parseInt(nk.split(" ")[0]);
        int k = Integer.parseInt(nk.split(" ")[1]);

        String str = br.readLine();
        int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> answer = new ArrayList<>();

        //슬라이딩 윈도우 세팅
        for(int i=0; i<k-1; i++){
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }
        //

        int lt = 0;
        for(int rt = k-1; rt<n; rt++){
            hashMap.put(arr[rt], hashMap.getOrDefault(arr[rt], 0) + 1);
            answer.add(hashMap.size());
            hashMap.put(arr[lt], hashMap.get(arr[lt]) -1);
            if(hashMap.get(arr[lt]) == 0){
                hashMap.remove(arr[lt]);
            }
            lt++;
        }

        for(Integer num : answer){
            bw.write(num + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
