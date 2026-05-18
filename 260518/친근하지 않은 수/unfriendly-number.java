import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   
        int count = 0;

        for(int i=1; i<=n; i++) {
            if (i%2!=0 && i%3!=0 && i%5!=0 ) {
                count++;
            }
        }
        System.out.println(count);


        /*int []a = new int[n];

        for (int i=1; i<n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i= 1; i<n; i++) {
            if (a[i] % 2 == 0 || a[i] % 3 == 0 || a[i] % 5 != 0) {
            System.out.println(a[i]);
        }*/
        
    
}
}