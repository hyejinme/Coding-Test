package Section1;

import java.util.Scanner;

public class S11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s + " "; //마지막 문자열 비교를 위해 빈값 추가
        String result = "";
        int count = 1;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)) {
                count++;
            }else {
                result += s.charAt(i);
                if(count > 1) result += String.valueOf(count);
                count = 1;
            }

        }

        System.out.println(result);
    }
}
