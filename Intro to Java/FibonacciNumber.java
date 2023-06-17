import java.util.*;

public class FibonacciNumber {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 0;
        int b = 1;
        int c;
        int sum = 0;
        for (int i = 0; i <n; i++) {
            c = a + b;
            a = b;
            b = c;
            sum = sum + c;
            System.out.print(c+"," );
        }
        System.out.println();
        System.out.println(sum);
        System.out.println(a);
    }
}
