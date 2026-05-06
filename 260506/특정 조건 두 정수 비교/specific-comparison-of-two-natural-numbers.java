import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n;
        int m;
       
        if (a<b) {
            n = 1;
            
        } else {
            n = 0;
            
        }

          if (a==b) {
            m = 1;
           
        } else {
            m = 0;
           
        }
        System.out.println(n+" "+m);
    }
}