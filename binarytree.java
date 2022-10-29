import java.util.Scanner;
public class binarytree{
    public static class node{
        String data;
        node lt,rt;
        node(String a){
            lt=null;
            rt=null;
            data=a;
        }
    }
    public static class bt{
        void creation(){
            node root=new node("-");
            root.lt=new node("20");
            root.rt=new node("+");
            root.rt.lt=new node("5");
            root.rt.rt=new node("*");
            root.rt.rt.lt=new node("/");
            root.rt.rt.rt=new node("3");
            root.rt.rt.lt.lt=new node("6");
            root.rt.rt.lt.rt=new node("2");
            System.out.print("Inorder traversal: ");
            inorder(root);
            System.out.println();
            System.out.print("Preorder traversal: ");
            preorder(root);
            System.out.println();
            System.out.print("Postorder traversal: ");
            postorder(root);
            System.out.println();
            System.out.print("Evaluation of expression is: "+eval(root));
            System.out.println();
        }
        void inorder(node root){
            if(root!=null){
                inorder(root.lt);
                System.out.print(root.data+" ");
                inorder(root.rt);
            }
        }
        void preorder(node root){
            if(root!=null){
                System.out.print(root.data+" ");
                preorder(root.lt);
                preorder(root.rt);
            }
        }
        void postorder(node root){
            if(root!=null){
                postorder(root.lt);
                postorder(root.rt);
                System.out.print(root.data+" ");
            }
        }
        int toint(String s){
            int num=0;
            for(int i=0;i<s.length();i++){
                num=num*10+(s.charAt(i)-'0');
            }
            return num;
        }
        int eval(node root){
            if(root==null){
                return 0;
            }
            if(root.lt==null||root.rt==null){
                return toint(root.data);
            }
            int a=eval(root.lt);
            int b=eval(root.rt);
            String op=root.data;
            return process(op, a, b);
        }
        int process(String op, int a,int b){
            if(op=="+"){
                return a+b;
            }
            if(op=="-"){
                return a-b;
            }
            if(op=="*"){
                return a*b;
            }
            if(op=="/"){
                return a/b;
            }
            return 0;
        }
    }
    public static void main(String[] args){
        bt b=new bt();
        b.creation();
    }
}