import java.util.Scanner;
public class fac1 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a,b=1,c=1;
        System.out.println("Enter number");
        a=in.nextInt();
        for(b=1;b<=a;b++){
            c*=b;
        }
        System.out.println(c);
    }
}
