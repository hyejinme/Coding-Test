package Section1;

import java.util.Scanner;

public class S01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        int count = 0;

        for(int i=0; i<s1.length(); i++){
            if(String.valueOf(s1.charAt(i)).equalsIgnoreCase(s2)){
                count++;
            }
        }

        System.out.println(count);
    }
}
