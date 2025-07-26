import java.util.Scanner;

public class RelationalOpt {
    public static void main(String[] args) {
        // Relational operator are used to find out thr relationship between two operands.
        // And it's return the boolean value as an output.
        Scanner sc=new Scanner(System.in);  // Scanner is used to reading user input.
        System.out.println("Enter two number: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Num1 is greater than num2 :"+(num1>num2));
        System.out.println("Num1 is less than num2 :"+(num1<num2));
        System.out.println("Num1 is greater than equal to num2 :"+(num1>=num2));
        System.out.println("Num1 is less than equal to num2 :"+(num1<=num2));
        System.out.println("Num1 is equal to  num2 :"+(num1==num2));
        System.out.println("Num1 is not equal to num2 :"+(num1!=num2));
    }
}
