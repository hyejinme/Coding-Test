package Section2;

import java.util.Scanner;

public class S11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        //1-5학년까지 N명의 반을 나타내는 표
        int[][] room = new int[N+1][6];

        //1부터 사용
        for(int i=1; i<=N; i++){
            for(int j=1; j<=5; j++){
                room[i][j] = sc.nextInt();
            }
        }

        int answer = 0;
        int max = Integer.MIN_VALUE;
        for(int i=1; i<=N; i++) {
            int count = 0;
            for(int j=1; j<=N; j++) {
               for(int k=1; k<=5; k++){
                   //00 - 00 10 20 30 40
                   //01 - 01 11 21 31 41
                   if(room[i][k] == room[j][k]) {
                       count++;
                       break;
                   }
               }
            }

            if(count > max){
                max = count;
                answer = i;
            }
        }

        System.out.println(answer);

    }
}
