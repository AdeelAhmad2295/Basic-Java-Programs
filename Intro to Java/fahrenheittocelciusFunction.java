import java.util.*;

public class fahrenheittocelciusFunction {
    public static void fahrenheitToCelcius(int start, int end, int step) {
        int currentValue = start;
        while (currentValue <= end) {
            int fahrenheitValue = (int) ((5.0 / 9) * (currentValue - 32));
            System.out.println(currentValue + "\t" + fahrenheitValue);
            currentValue += step;
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();
        int step = s.nextInt();
        fahrenheitToCelcius(start, end, step);

    }
}
