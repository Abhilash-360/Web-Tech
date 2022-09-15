import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second number: ");
        int b = sc.nextInt();
        if(b==0){
            System.out.println("Division not possible!!!\n");
            return;
        }
        int quotient = a/b;
        int remainder = a%b;

        System.out.println("The quotient is: " + quotient);
        System.out.println("The remainder is: " + remainder);

    }
}