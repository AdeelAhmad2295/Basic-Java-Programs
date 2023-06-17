import java.util.*;
public class Multiplicationtable {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=1;
        for(int i=1;i<=10;i++){
            sum=n*i;
            System.out.println(sum);
        }
}
}
