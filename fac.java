import java.util.Scanner;
public class fac {
    static int fac(int a){
        if(a==0||a==1){
            return 1;
        }
        else{
            return a*fac(a-1);
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a;
        System.out.println("Enter number\n");
        a=in.nextInt();
        System.out.println(fac(a));
    }
}
