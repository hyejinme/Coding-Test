package Section1;

import java.util.Scanner;

public class S02 {
    public String solution(String str){
        String result = "";
        for(char x : str.toCharArray()){
            if(Character.isUpperCase(x)){
                result += Character.toLowerCase(x);
            }else{
                result += Character.toUpperCase(x);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        S02 T = new S02();
        System.out.println(T.solution(str));
    }
}
