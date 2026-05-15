import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.print(x + " " + y+ " ");

        for (int i=2; i<10; i++) {
           
            int z = (x + y) % 10;
            System.out.print(z + " ");

            x=y;
            y=z;
        }
    }
}