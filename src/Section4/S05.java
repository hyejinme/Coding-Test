package Section4;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class S05 {
    public int Solution(int[] arr, int n, int k){
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder()); //내림차순 정렬
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int l=j+1; l<n; l++) {
                    treeSet.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int count = 0;
        for(int x : treeSet) {
            count++;
            if(count == k) return x;
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));

        String nk = br.readLine();
        int n = Integer.parseInt(nk.split(" ")[0]);
        int k = Integer.parseInt(nk.split(" ")[1]);

        String str = br.readLine();
        int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        S05 T = new S05();
        bw.write(String.valueOf(T.Solution(arr, n, k)));
        bw.flush();
        bw.close();
        br.close();
    }
}
