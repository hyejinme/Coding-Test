package Section1;
import java.util.Scanner;

public class S07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = new StringBuilder(s).reverse().toString();
        if(s.equalsIgnoreCase(result)) System.out.println("YES");
        else System.out.println("NO");
    }
}
