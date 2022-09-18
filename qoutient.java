import java.util.Scanner;
public class qoutient {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Enter  two number\n");
        a=in.nextInt();
        b=in.nextInt();
        c=a/b;
        d=a%b;
        System.out.println(c);
        System.out.println(d);
    }
}
