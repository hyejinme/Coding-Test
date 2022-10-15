package Section2;

import java.util.Scanner;

public class S04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] num = new int[N];
        num[0] = 1;
        num[1] = 1;

        for(int i=2; i<num.length; i++) {
            num[i] = num[i-1] + num[i-2];
        }

        for(int i=0; i<num.length; i++){
            System.out.print(num[i] +" ");
        }

    }
}
