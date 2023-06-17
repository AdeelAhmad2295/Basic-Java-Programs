import java.util.Scanner;

public class ConditionalAndRealrional {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if (a > 0 && b > 0) {
            System.out.println("no. is positive");
        } else if (a < 0 || b < 0) {
            System.out.println("no. is negative");
        } else {
            System.out.println("equal");
        }
    }

}
