package Section2;
import java.util.Scanner;

public class S08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] score = new int[N];

        for(int i=0; i<N; i++){
            score[i] = sc.nextInt();
        }

        for(int i=0; i<score.length; i++){
            int count = 1;
            for(int j=0; j<score.length; j++){
                if(score[i] < score[j]) count++;
            }
            System.out.print(count+" ");
        }
    }
}
