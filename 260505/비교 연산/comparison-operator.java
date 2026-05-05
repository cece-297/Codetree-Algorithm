import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer;
        boolean one = a>=b;
        boolean two = a>b;
        boolean three = a<=b;
        boolean four = a<b;
        boolean five = a==b;
        boolean six = a!=b;
       
       
    System.out.println(one ? 1 : 0);
    System.out.println(two ? 1 : 0);
    System.out.println(three ? 1 : 0);
    System.out.println(four ? 1 : 0);
    System.out.println(five ? 1 : 0);
    System.out.println(six ? 1 : 0);
    }
    
}