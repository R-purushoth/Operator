import java.util.Scanner;

public class LogicalOpt {
    // logical operator are used to find out the relationship between two are more expressions.
    // "&&"- AND; it's used to check if the both condition are true then return a boolean value true or else false
    // "||" - OR it's used to check if any one condition is true return  true. if both condition are false that tie return false
    // "!" - NOT it's check if the condition true it will return false and the condition is false it will return true.
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three number: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        System.out.println(num1>num2 && num1>num3 );
        System.out.println(num2>num1 || num2>num3 );
        System.out.println(num3 != num1);
    }
}
