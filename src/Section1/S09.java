package Section1;

import java.util.Scanner;

public class S09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                result += c;
            }
        }

        System.out.println(Integer.parseInt(result));
    }
}
