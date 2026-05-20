import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char n = sc.next().charAt(0);
        String []a = {"apple", "banana", "grape", "blueberry", "orange"};
        int total = 0;
        
        for (int i = 0; i <5; i++) {

            if ((n==a[i].charAt(2)) || (n==a[i].charAt(3))) {
                System.out.println(a[i]);
                total += 1;
            }
        }   
        System.out.println(total);
        // Please write your code here.
    }
}