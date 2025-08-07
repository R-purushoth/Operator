import java.util.Scanner;

public class Increment_decrementOpt {
    static void postincrement(int num){
        num++;
        System.out.println("Post Increment "+num);
    }
    static void preincrement(int num){
        ++num;
        System.out.println("pre Increment "+( ++num));
    }

    static void postdecrement(int num){
        num--;
        System.out.println("Post Decrement "+num);
    }
    static void predecrement(int num){
        --num;
        System.out.println("pre Decrement "+( --num));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        postincrement(num);
        preincrement(num);
        postdecrement(num);
        predecrement(num);
        // increment and decrement operator use one operand.
        // that mean only one operand to perform an operation
        // that are two types
        // Increment----> pre increment and post increment
        // Decrement----> pre decrement and post decrement
    }
}
