package Section1;

import java.util.Scanner;

public class S06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result  = "";
        for(int i=0; i<s.length(); i++){
            char[] c = s.toCharArray();
            if(s.indexOf(c[i]) == i) {
                result += c[i];
            }
        }
        System.out.println(result);
    }
}
