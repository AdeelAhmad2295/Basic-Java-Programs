import java.util.Scanner;

public class ContinueKeyword {
       public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        // int i=0;
        // for(;;)
        for(int i=1;i<=n;i++)
        {
            if(i==4){
                continue;
            }
            System.out.println(i);
        }
    }
}
