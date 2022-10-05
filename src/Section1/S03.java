package Section1;

import java.util.Scanner;

public class S03 {
    public String Solution(String str){
        String result = "";
        int maxLength = Integer.MIN_VALUE, pos; //가장 작은 값으로 초기화
        /*String[] s = str.split(" ");
        for(int i=0; i<s.length; i++){
            if(maxLength < s[i].length()){
                maxLength = s[i].length();
                result = s[i];
            }
        }*/
        //다른 풀이
        while ((pos = str.indexOf(' ')) != -1){ //공백이 더이상 없을때까지(문장이 끝날때까지)
            String tmp = str.substring(0, pos); //공백 직전까지로 자름
            int len = tmp.length();
            if(len > maxLength){
                maxLength = len;
                result = tmp;
            }
             str = str.substring(pos+1);// 다음 처리를 위해
        }
        if(str.length() > maxLength) result = str; //마지막 단어 처리

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        S03 T = new S03();
        System.out.println(T.Solution(str));
    }
}
