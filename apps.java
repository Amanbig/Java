import java.util.Arrays;
import java.text.NumberFormat;
import java.util.Scanner;
public class apps {
    public static void main(String[] args){
        System.out.println("Hello");
        String a="hello";
        System.out.println(a.length());
        System.out.println(a.charAt(2));
        System.out.println(a.substring(0,4));
        int[] marks=new int[3];
        marks[0]=3;
        marks[2]=3;
        marks[1]=4;
        System.out.println(marks[2]);
        System.out.println(a.trim());
        System.out.println(Arrays.toString(marks));
        NumberFormat currency=NumberFormat.getCurrencyInstance();
        String result=currency.format(1234523.24);
        System.out.println(result);
        Scanner scanner=new Scanner(System.in);
        byte age=scanner.nextByte();
        System.out.println(age);
    }
}
