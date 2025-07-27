import java.util.Scanner;
public class AssignmentOpt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        System.out.println(a+=10);// a+=10 ==> a=a+10; that mean to add A values and 10 to store again in a.
        System.out.println(a-=5);
        System.out.println(a*=2);
        System.out.println(a/=2);
    }
}
