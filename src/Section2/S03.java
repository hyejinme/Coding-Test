package Section2;

import java.util.Scanner;

public class S03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];

        //1:가위, 2:바위, 3:보
        //이기는 경우의 수 가위(1)<바위(2), 바위(2)<보(3), 보(3)<가위(1)
        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<N; i++){
            b[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++){
            if(a[i] == b[i]) System.out.println("D"); // 비기는 경우의 수
            else if(a[i] == 1 && b[i] == 3) System.out.println("A");
            else if(a[i] == 2 && b[i] == 1) System.out.println("A");
            else if(a[i] == 3 && b[i] == 2) System.out.println("A");
            else System.out.println("B");
            }
        }

    }

