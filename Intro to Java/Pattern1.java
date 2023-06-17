import java.util.*;
public class Pattern1 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int p=1;
        for(int i=1;i<=n;i++)
        {
            p=i;

            for(int j=1;j<=n;j++)
            // for(int j=1;j<=i;j++)

            {
                
                System.out.print("*");   
                                            //  ****
                //                           ****
                //                           ****
                //                           ****
                // System.out.print(j);        1234
                //                             1234    
                //                             1234
                //                             1234
                // System.out.print(i);    
                                        // 1111
                //                         2222
                //                         3333
                //                         4444
                            
                // System.out.print(n-j+1);    
                                            // 4321
                //                             4321
                //                             4321
                //                             4321
                // System.out.print(p);        
                                            // 1234
                //                             2345
                //                             3456
                //                             4567
                        
                // p=p+1;

        }
        System.out.println("");
    }
}
}
