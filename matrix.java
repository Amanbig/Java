import java.util.Scanner;
public class matrix {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Enter ow and column");
        a=in.nextInt();
        b=in.nextInt();
        int[][] ar=new int[a][b];
        int[][] br=new int[a][b];
        int[][] cr=new int[a][b];
        System.out.println("Enter first matrix");
        for(c=0;c<a;c++){
            for(d=0;d<b;d++){
                ar[c][d]=in.nextInt();
            }
        }
        System.out.println("Enter Second matrix");
        for(c=0;c<a;c++){
            for(d=0;d<b;d++){
                br[c][d]=in.nextInt();
            }
        }
        System.out.println("The sum of matrix is");
        for(c=0;c<a;c++){
            for(d=0;d<b;d++){
                cr[c][d]=ar[c][d]+br[c][d];
            }
        }
        for(c=0;c<a;c++){
            for(d=0;d<b;d++){
                System.out.print(cr[c][d]);
            }
            System.out.println();
        }
    }
}
