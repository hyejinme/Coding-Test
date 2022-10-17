package Section2;

import java.util.Scanner;

public class S06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.next();
        }

        S06 T = new S06();
        for(String str : arr){
            String reverse = new StringBuilder(str).reverse().toString();
            if(T.isPrime(Integer.parseInt(reverse))){
                System.out.print(Integer.parseInt(reverse) + " ");
            }
        }
    }

    public boolean isPrime(int num){
        if(num == 1) return false;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
