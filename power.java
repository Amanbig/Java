import java.util.Scanner;
public class power {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a,b,c,d=1;
        System.out.println("Enter numbers");
        a=in.nextInt();
        b=in.nextInt();
        for(c=0;c<b;c++){
            d*=a;
        }
        System.out.println(d);
    }
}
