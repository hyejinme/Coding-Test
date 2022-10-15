package Section2;

import java.util.Scanner;

public class S05 {
    public boolean solution(int N){
        for(int i=2; i<=Math.sqrt(N); i++){
            if(N % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        S05 T = new S05();

        for(int i=2; i<=N; i++){ //1은 소수가 아님
            if(T.solution(i)){
                count++;
            }
        }

        System.out.println(count);
    }
}
