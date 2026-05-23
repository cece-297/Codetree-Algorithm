import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.print(A + " ");

        while (true) {

            if (A % 2 == 1) {
                A = 2*A;
            } else if (A % 2 == 0) {
                A += 3;
            }
            if (A > B) {
                break;
            }
            System.out.print(A + " ");
        }
        // Please write your code here.
    }
}