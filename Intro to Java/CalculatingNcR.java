import java.util.*;

public class CalculatingNcR {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();
        int c;
        int sum1 = 1;
        int sum2 = 1;
        int all2 = 1;
        for (int i = 1; i <= n; i++) {
            sum1 = sum1 * i;
        }
        for (int j = 1; j <= r; j++) {
            sum2 = sum2 * j;
        }
        for (int k = 1; k <= n - r; k++) {
            all2 = all2 * k;
        }
        c = sum1 / (sum2 * all2);
        System.out.println(c);

    }
}

// import java.util.*;

// public class CalculatingNcR {
// public static int fact(int n) {
// int fact= 1;
// for (int i = 1; i <= n; i++) {
// fact = fact* i;
// }
// return fact;
// }

// public static void main(String[] args) {

// Scanner s = new Scanner(System.in);
// int n = s.nextInt();
// int r = s.nextInt();

// // for (int j = 1; j <= r; j++)
// // {
// // sum2 = sum2 * j;
// // }
// // for (int k = 1; k <= n-r; k++) {
// // all2 = all2 * k;
// // }

// int a = fact(n);
// int b = fact(r);
// System.out.println(a);
// System.out.println(b);

// int c = n-r;
// int j = fact(c);
// int z = a / (b * j);
// System.out.println(j);
// System.out.println(z);

// }
// }
