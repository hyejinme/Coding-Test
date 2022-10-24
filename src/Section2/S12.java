package Section2;

import java.util.Scanner;

public class S12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //N명의 학생
        int M = sc.nextInt(); //M번의 테스트
        int[][] score = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                score[i][j] = sc.nextInt();
            }
        }


        int answer = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                int count = 0;
                for (int k = 0; k < M; k++) {
                    //00-10, 01-11, 02-12비교 왼쪽이 "전부" 크면 체크
                    //00-20, 01-21, 02-22비교 왼쪽이 "전부" 크면 체크
                    //00-30, 01-31, 02-32비교 왼쪽이 "전부" 크면 체크
                    int pi = 0, pj = 0;
                    for(int s=0; s<N; s++){
                        if(score[k][s] == i) pi = s;
                        if(score[k][s] == j) pj = s;
                    }
                    if(pi<pj) count++;
                }
                if(count == M) answer++;
            }
        }
        System.out.println(answer);
    }
}
