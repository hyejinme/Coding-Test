package Section2;

import java.util.Scanner;

public class S07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] score = new int[N];

        for(int i=0; i<N; i++){
            score[i] = sc.nextInt();
        }
        int count = 0;
        int result = 0;

        for(int i=1; i<score.length; i++){
            if(score[i-1] == 1){
                count++;
                result += count;
            }
            else count = 0;
        }
        if(score[score.length-1] == 1){
            count++;
            result += count;
        }

        System.out.println(result);
    }
}
