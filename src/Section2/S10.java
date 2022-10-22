package Section2;

import java.util.Scanner;

public class S10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] board = new int[N+2][N+2];
        for(int i=1; i<N+1; i++){
                for(int j=1; j<N+1; j++){
                board[i][j] = sc.nextInt();
            }
        }

        //5 3 7
        //3 7 1
        //7 2 5 라고 했을 때 가운데 7은 봉우리가 된다
        //board[0][0] board[0][1] board[0][2]
        //board[1][0] board[1][1] board[1][2]
        //board[2][0] board[2][1] board[2][2]
        //board[1][1]이 봉우리인 걸 판단하기 위해서는
        //board[1][1] 과 board[0][1] board[1][0] board[1][2] board[2][1]과 비교해야 함
        //board[i][j]면 board[i-1][j] board[i][j-1] board[i][j+1] board[i+1][j]가 된다
        int check = 0;
        for(int i=1; i<N+1; i++){
            for(int j=1; j<N+1; j++){
               if(board[i][j] > board[i-1][j] && board[i][j] > board[i][j-1] && board[i][j] > board[i][j+1] && board[i][j] > board[i+1][j]){
                   check++;
               }
            }
        }

        System.out.println(check);

    }
}
