import java.util.Scanner;

public class BreakKeyword {
       public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            if(i==2){
                break;
            }
            System.out.println(i);
        }
    }
    
}
