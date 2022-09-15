import java.util.*;


public class q1{
    public static int addition(int a,int b){
        return a+b;
    }
    public static int subtraction(int a,int b){
        return a-b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        int add = addition(a,b);
        System.out.println("Addition of two number is : " + add);
        int sub = subtraction(a,b);
        System.out.println("Subtraction of two number is : "+ sub);
    }
}