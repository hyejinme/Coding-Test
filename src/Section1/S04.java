package Section1;

import java.util.Scanner;

public class S04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            String s = sc.next();
            //풀이1
            /*String result = "";
            for(int j=s.length()-1; j>=0; j--){
                result += s.substring(j, j+1);
            }*/
            //풀이2
           /* String result = new StringBuilder(s).reverse().toString();*/
            //풀이3
            char[] c = s.toCharArray();
            int leftIdx = 0;
            int rightIdx = s.length()-1;
            while (leftIdx < rightIdx){
                char tmp = c[leftIdx];
                c[leftIdx] = c[rightIdx];
                c[rightIdx] = tmp;
                leftIdx++;
                rightIdx--;
            }
            String result = new String(c);
            System.out.println(result);
        }
    }
}
