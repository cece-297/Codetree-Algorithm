import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String result;
        
        if (a.length() != b.length()) {
            result = (a.length() > b.length() ? a : b);
            System.out.println(result + " " + result.length());
        } else {
            System.out.println ("same");
        }

        
        // Please write your code here.
    }
}