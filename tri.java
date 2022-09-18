import java.util.Scanner;
public class tri {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Enter row\n");
        a=in.nextInt();
        for(c=0;c<a;c++){
            for(d=c;d<a;d++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
