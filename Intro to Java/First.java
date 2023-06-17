// public class First {
//     public static void main (String args[]){
//         int a=10,b=20;
//         int c=a&b;
//         System.out.println(c);
//          int d=a|b;
//         System.out.println(d);
//          int e=a^b;
//         System.out.println(e);
//          int f=c+d+e;
//         System.out.println(~f);
//     }
// }
// import java.util.*;
// public class First {
//     public static int math (int a,int b,int c)
//     {
//         if(c==1){
//         int sum=a+b;    
//             return sum;
//         }
//         if(c==2){
//             int sum=a-b;
//             return sum;
//         }
//         else if(c==3){
//             int sum=a*b;
//             return sum;
//         }
//         else{
//             double last=a/b;
//             return last;
//         }
//     }
//     public static void main(String args[]){
//         Scanner s=new Scanner (System.in);
//         int a=s.nextInt();
//         int b=s.nextInt();
//         int c=s.nextInt();
//         int sum=math(a,b,c);
//         double last=math(a,b,c);
//         if(c<=3){
//         System.out.println(sum);
//         }else{
//             System.out.println(last);
//         }  
//     }
// }
// public class First{
//     public static void printFahrenheitTable(int start, int end, int step) {
//         int currentValue = start;
//         while (currentValue <= end) {
//             int fahrenheitValue = (int) ((5.0 / 9) * (currentValue - 32));
//             System.out.println(currentValue + "\t" + fahrenheitValue);
//             currentValue += step;
//         }
//     }

//     public static void main(String[] args) {
//         // Example usage
//         printFahrenheitTable(0, 100, 10);
//     }
// }

public class First {
    public static void func(int a) {
        int b = 10;
        a = a + 10;
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a = 10;
        func(a);
        System.out.println(a);
    }
}