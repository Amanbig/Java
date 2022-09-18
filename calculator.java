import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a,b; 
        System.out.println("Enter two numners");
        a=in.nextInt();
        b=in.nextInt();
        String c;
        System.out.println("Enter + - * /");
        c=in.next();
        switch(c){
            case "+":
            System.out.println(a+b);
            break;
            case "-":
            System.out.println(a-b);
            break;
            case "*":
            System.out.println(a*b);
            break;
            case "/":
            System.out.println(a/b);
            break;
            default:
            System.out.println("No match to your selection\n");
            break;
        }
    }
}
