import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int m = 0;

        for (int i=0; i<10; i++) {
            int a = sc.nextInt();
            if (a%3==0) {
                n++;
            }
            if (a%5==0) {
                m++;
            }
        }
        System.out.println(n + " " + m);
       
    }
}