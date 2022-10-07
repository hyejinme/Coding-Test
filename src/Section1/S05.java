package Section1;

import java.util.Scanner;

public class S05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = sc.next();
        char[] c = result.toCharArray();
        int leftIndex = 0;
        int rightIndex = result.length()-1;
        while (leftIndex < rightIndex){
            if(!Character.isAlphabetic(c[leftIndex])) {
                leftIndex++;
            }else if(!Character.isAlphabetic(c[rightIndex])){
                rightIndex--;
            }else{
                char temp = c[leftIndex];
                c[leftIndex] = c[rightIndex];
                c[rightIndex] = temp;
                leftIndex++;
                rightIndex--;
            }
        }
        System.out.println(new String(c));
    }
}
