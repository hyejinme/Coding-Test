package Section6;

import java.io.*;
import java.util.Arrays;

public class S03 {
    public int[] solution(int n, int[] arr) {
        for(int i=1; i<n; i++) {
            int tmp = arr[i];
            int j;
            for(j=i-1; j>=0; j--) {
                if(arr[j] > tmp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();

            S03 T = new S03();
            for(int result : T.solution(n, arr)) {
                bw.write(result + " ");
            }
            bw.flush();
            bw.close();
            br.close();
        }
    }
