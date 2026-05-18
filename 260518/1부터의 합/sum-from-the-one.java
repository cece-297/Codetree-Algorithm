import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;

        for (int i = 1; i<=100; i++) {
            sum += i;
            count = i;
            
            if (sum >= n) {
            break;
            }
        }
        
        System.out.println(count);
        // Please write your code here.
    }
}