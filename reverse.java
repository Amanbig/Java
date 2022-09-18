import java.util.Scanner;
public class reverse {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a,b,c=0,d;
        System.out.println("Enter number");
        a=in.nextInt();
        while(a!=0){
            b=a%10;
            c=c*10+b;
            a/=10;
        }
        System.out.println(c);
    }
}
