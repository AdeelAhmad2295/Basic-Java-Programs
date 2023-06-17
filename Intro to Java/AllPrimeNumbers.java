import java.util.*;

public class AllPrimeNumbers {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 2; i <= n; i++) {
            boolean isprime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isprime = false;

                }
                if (isprime == true) {
                    System.out.println(i);
                    break;
                }

            }

        }
        // for(int i=2;i<=n;i++){
        // int count=0;
        // for(int j=2;j<=i;j++){
        // if(i%j==0)
        // count++;
        // }
        // if(count==1)
        // System.out.println(i);

        // }
    }
}