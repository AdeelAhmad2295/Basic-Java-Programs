import java.lang.invoke.StringConcatFactory;
import java.util.*;
public class FahbonacciNumber {
    public static boolean fabonacci(int n){
        int a=0;
        int b=1;
        int c;
        while(a<n){
            c=a+b;
            a=b;
            b=c;
        }
        if(a==n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean fabonacci=fabonacci(n);
        System.out.println(fabonacci);
    }
}
