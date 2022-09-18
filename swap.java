import java.util.Scanner;
public class swap {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter number\n");
        a=in.nextInt();
        b=in.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
    }
}
