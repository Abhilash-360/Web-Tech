import java.util.*;

public class q4 {
    public static void Swap_using_temp(int a,int b){
        int t = a;
        a = b;
        b = t;
        System.out.println("The First number is: " + a);
        System.out.println("The Second number is: " + b);
    }
    public static void Swap_without_using_temp(int a,int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("The First number is: " + a);
        System.out.println("The Second number is: " + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second number: ");
        int b = sc.nextInt();

        System.out.println("Enter 0 to swap using temporary var and 1 without temporary var: ");
        

        int c = sc.nextInt();
        if(c==0){
            Swap_using_temp(a, b);
        }else{
            Swap_without_using_temp(a, b);
        }
        
    }
}
