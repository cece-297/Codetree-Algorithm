import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        int lenA = a.length();
        int lenB = b.length();

        if (lenA == lenB) {
            System.out.println("same");
        } else {
            String longer = (lenA > lenB) ? a : b;
            System.out.println(longer + " " + longer.length());
        }
    }
}