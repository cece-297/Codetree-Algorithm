import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        StringBuilder sb = new StringBuilder(A);

        sb.setCharAt(1, 'a');
        sb.setCharAt((A.length()-2), 'a');

        String result = sb.toString();
    
        
        System.out.println(result);
        // Please write your code here.
    }
}