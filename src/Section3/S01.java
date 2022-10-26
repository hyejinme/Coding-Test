package Section3;

import java.util.ArrayList;
import java.util.Scanner;

public class S01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] firstArr = new int[N];
        for(int i=0; i<N; i++){
            firstArr[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] secondArr = new int[M];
        for(int i=0; i<M; i++){
            secondArr[i] = sc.nextInt();
        }

        ArrayList<Integer> answer = new ArrayList<>();

        int p1=0, p2=0;
        while (p1<N && p2<M){ //둘 중 하나라도 끝에 닿으면 멈춤
            if(firstArr[p1] < secondArr[p2]) answer.add(firstArr[p1++]);
            else answer.add(secondArr[p2++]);
        }

        //둘 중 하나가 남아있을 경우
        while (p1<N) answer.add(firstArr[p1++]);
        while (p2<M) answer.add(secondArr[p2++]);

        for(Integer result : answer){
            System.out.print(result + " ");
        }
    }
}
