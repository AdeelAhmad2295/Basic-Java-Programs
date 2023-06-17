import java.util.*;

public class ConditionalLoopExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if (a > b) {
            System.out.println("First No. is Greater" + a);
        } else if (b > a) {
            System.out.println("Second No. is Greater " + b);
        } else {
            System.out.println("Not Defined");
        }
    }

}
