import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String n = "";

        while (a != 25) {
            if (a < 25 ) {
                n = "Higher";
            } else if (a > 25) {
                n = "Lower";    
            }
            System.out.println(n);
            a = sc.nextInt();
        }
        System.out.println("Good");
        // Please write your code here.
    }
}