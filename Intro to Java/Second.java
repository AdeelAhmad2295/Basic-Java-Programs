import java.util.*;

public class Second {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println("");
        }
    }
}
        // System.out.print("*");

        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        // int num;
        // int sum=0;
        // int lastnum = n;
        // while (n > 0) {
        // num = n % 10;
        // sum = (num * 10) + num;
        // n = n / 10;
        // }
        // if (lastnum == sum) {
        // System.out.println("true");
        // } else {
        // System.out.println("false");
        // }
//     }
// }
