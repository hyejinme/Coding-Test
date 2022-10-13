package Section2;

import java.util.ArrayList;
import java.util.Scanner;

public class S02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0; i<N; i++){
            int height = sc.nextInt();
            arrayList.add(height);
        }
        int max = Integer.MIN_VALUE;
        int count = 0;

        for(Integer n : arrayList){
            if(max < n){
                count++;
                max = n;
            }
        }
        System.out.println(count);
    }
}
