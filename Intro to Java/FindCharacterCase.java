import java.util.Scanner;
public class FindCharacterCase {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        char n=s.next().charAt(0);
        int a=n;
        if(a>=65 && a<=90){
            System.out.println("1");
        }else if(a>=97 && a<=122){
            System.out.println("0");
        }
        else{
            System.out.println("-1");
        }
    }
}
