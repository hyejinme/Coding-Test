package Section1;

import java.util.Scanner;

public class S10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int[] check = new int[s.length()];
        int count = 1000;
        //인덱스 체크 값을 이용해 최소 거리 구하기
        for(int i=0; i<s.length(); i++){
            if(String.valueOf(s.charAt(i)).equals(t)){
                count = 0;
                check[i] = count;
            }else{
                count++;
                check[i] = count;
            }
        }
        count = 1000;
        for(int i=s.length()-1; i>=0; i--){
            if(String.valueOf(s.charAt(i)).equals(t)) count = 0;
            else{
                count++;
                check[i] = Math.min(check[i], count); //
            }
        }

        for(int i=0; i<check.length; i++){
            System.out.print(check[i]+" ");
        }

    }
}
