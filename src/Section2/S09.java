package Section2;

import java.util.ArrayList;
import java.util.Scanner;

public class S09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] board = new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                board[i][j] = sc.nextInt();
            }
        }
        //1. 각 행 계산
        //2. 각 열 계산
        //3. 대각선 계산 (1) - board[0][0] board[1][1]....board[4][4]
        //   대각선 계산 (2) - board[0][4] board[1][3] board[2][2] board[3][1] board[4][0]
        ArrayList<Integer> arrayList = new ArrayList<>();
        int sum = 0;
        int indexRow = 0;
        int indexColumn = 0;

        while (indexRow != N && indexColumn != N){
            for(int i=0; i<N; i++) { //행
                sum += board[indexRow][i];
            }
            arrayList.add(sum);
            sum = 0;
            indexRow++;

            for(int i=0; i<N; i++) { //열
                sum += board[i][indexColumn];
            }
            arrayList.add(sum);
            sum = 0;
            indexColumn++;
        }

        //대각선 1
        for(int i=0; i<N; i++) {
            sum += board[i][i];
        }
        arrayList.add(sum);
        sum = 0;
        //대각선 2
        for(int i=0; i<N; i++) {
            sum += board[i][N-1-i];
        }
        arrayList.add(sum);

        int max = arrayList.stream().mapToInt(n->n).max().getAsInt();
        System.out.println(max);


    }
}
