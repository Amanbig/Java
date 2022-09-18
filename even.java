import java.util.Scanner;
public class even {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a;
        System.out.println("Enter number");
        a=in.nextInt();
        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
