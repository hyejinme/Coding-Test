package Section1;

import java.util.Scanner;

public class S12 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //사용X
        String password = sc.next();
        password = password.replace("#","1").replace("*","0");
        String result = "";
       //정규식 이용해서 자름
       String[] binaryNum = password.split("(?<=\\G.{" + 7 + "})");
       for(int i=0; i<binaryNum.length; i++){
           result += (char) Integer.parseInt(binaryNum[i], 2);
       }
        System.out.println(result);*/

        //다른 풀이
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        String result = "";
        for(int i=0; i<N; i++){
            String tmp = s.substring(0, 7).replace("#","1").replace("*","0");
            result += (char) Integer.parseInt(tmp, 2);
            s = s.substring(7);
        }

        System.out.println(result);


    }
}
