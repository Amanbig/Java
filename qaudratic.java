import java.math.*;
import java.util.Scanner;
public class qaudratic {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a,b,c;
        double d,e;
        System.out.println("Enter coeeficient of x2");
        a=in.nextInt();
        System.out.println("Enter coefficient of x");
        b=in.nextInt();
        System.out.println("enter constant term");
        c=in.nextInt();
        e=b*b-4*a*c;
        if(e<0){
            System.out.println("The roots are imaginary\n");
            d=Math.sqrt(-e);
            System.out.print(-b/(2*a)); System.out.print("+"); System.out.println((-d)/(2*a));
            System.out.print(-b/(2*a)); System.out.print("-"); System.out.println((-d)/(2*a));
        }
        else if(e==0){
            System.out.println("The roots are equal\n");
            System.out.println((-b)/(2*a));
            System.out.println((-b)/(2*a));
        }
        else{
            System.out.println("The roots are real and distinct\n");
            d=Math.sqrt(e);
            System.out.println((-b-d)/(2*a));
            System.out.println((-b+d)/(2*a));
        }
    }
}
