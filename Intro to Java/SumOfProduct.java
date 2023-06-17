import java.util.*;
public class SumOfProduct {
    public static void main (String args[])
    {
        int n,c,sum=0,mul=0;

        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        c=s.nextInt();
        if(c==1)
        {
            while(n<13 && n>0){
                sum=sum + n;
                n--;
            }
            System.out.println(sum);
        }
        else if(c==2)
        {
            while(n>0){
                mul=mul*n;
                n--;
            }
            System.out.println(mul);
        }
        else
        {
            System.out.println(-1);
        }
    }
        
}